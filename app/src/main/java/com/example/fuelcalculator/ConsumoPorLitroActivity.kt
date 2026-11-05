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

class ConsumoPorLitroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumo_por_litro)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar_consumo_litro)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val distancia = intent.getDoubleExtra("DISTANCIA", 0.0)
        val edtConsumoLitro = findViewById<EditText>(R.id.edtConsumoLitro)

        edtConsumoLitro.filters = arrayOf(DecimalDigitsInputFilter(2))

        val btnConsumoLitroProximo = findViewById<Button>(R.id.btnConsumoLitroProximo)

        btnConsumoLitroProximo.setOnClickListener {
            val consumoLitroStr = edtConsumoLitro.text.toString().replace(',', '.')
            val consumoLitro = consumoLitroStr.toDoubleOrNull()

            if (consumoLitro == null || consumoLitro <= 0) {
                edtConsumoLitro.error = "Digite um consumo válido maior que zero"
                return@setOnClickListener
            }

            val intent = Intent(this, PrecoCombustivelActivity::class.java)
            intent.putExtra("DISTANCIA", distancia)
            intent.putExtra("CONSUMO_LITRO", consumoLitro)
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