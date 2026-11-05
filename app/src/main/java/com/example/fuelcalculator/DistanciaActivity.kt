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

class DistanciaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distancia)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar_distancia)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val edtDistancia = findViewById<EditText>(R.id.edtDistancia)
        edtDistancia.filters = arrayOf(DecimalDigitsInputFilter(2))

        val btnDistanciaProximo = findViewById<Button>(R.id.btnDistanciaProximo)

        btnDistanciaProximo.setOnClickListener {
            val distanciaStr = edtDistancia.text.toString().replace(',', '.')
            val distancia = distanciaStr.toDoubleOrNull()

            if (distancia == null || distancia <= 0) {
                edtDistancia.error = "Digite uma distância válida maior que zero"
                return@setOnClickListener
            }

            val intent = Intent(this, ConsumoPorLitroActivity::class.java)
            intent.putExtra("DISTANCIA", distancia)
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