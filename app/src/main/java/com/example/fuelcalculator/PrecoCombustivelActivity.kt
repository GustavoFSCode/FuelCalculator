package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

class PrecoCombustivelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_preco_combustivel)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar_preco_combustivel)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)


        val distancia = intent.getDoubleExtra("DISTANCIA", 0.0)
        val consumoPorLitro = intent.getDoubleExtra("CONSUMO_LITRO", 0.0)

        val edtPrecoCombustivel = findViewById<EditText>(R.id.edtPrecoCombustivel)
        edtPrecoCombustivel.filters = arrayOf(DecimalDigitsInputFilter(2))

        val btnPrecoCombustivelCalcular = findViewById<Button>(R.id.btnPrecoCombustivelCalcular)

        btnPrecoCombustivelCalcular.setOnClickListener {
            val precoCombustivelStr = edtPrecoCombustivel.text.toString().replace(',', '.')
            val precoCombustivel = precoCombustivelStr.toDoubleOrNull()

            if (precoCombustivel == null || precoCombustivel <= 0) {
                edtPrecoCombustivel.error = "Digite um preço válido maior que zero"
                return@setOnClickListener
            }

            //Calculo sendo realizado!
            val litrosNecessarios = distancia / consumoPorLitro
            val custoTotal = litrosNecessarios * precoCombustivel

            //Passagem de valores para a tela do resultado
            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("CUSTO_TOTAL", custoTotal)
            intent.putExtra("DISTANCIA", distancia)
            intent.putExtra("CONSUMO_LITRO", consumoPorLitro)
            intent.putExtra("PRECO_COMBUSTIVEL", precoCombustivel)
            startActivity(intent)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}