package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val distancia = intent.getDoubleExtra("DISTANCIA", 0.0)
        val consumoPorLitro = intent.getDoubleExtra("CONSUMO_LITRO", 0.0)
        val precoCombustivel = intent.getDoubleExtra("PRECO_COMBUSTIVEL", 0.0)
        val custoTotal = intent.getDoubleExtra("CUSTO_TOTAL", 0.0)

        val tvDistancia = findViewById<TextView>(R.id.tvDistancia)
        val tvConsumo = findViewById<TextView>(R.id.tvConsumo)
        val tvPreco = findViewById<TextView>(R.id.tvPreco)
        val tvPrecoViagem = findViewById<TextView>(R.id.tvPrecoViagem)
        val btnResultadoNovo = findViewById<Button>(R.id.btnResultadoNovo)

        tvDistancia.text = String.format(Locale.getDefault(), "%.2f", distancia)
        tvConsumo.text = String.format(Locale.getDefault(), "%.2f", consumoPorLitro)
        tvPreco.text = String.format(Locale.getDefault(), "R$ %.2f", precoCombustivel)
        tvPrecoViagem.text = String.format(Locale.getDefault(), "R$ %.2f", custoTotal)

        btnResultadoNovo.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}