package com.masanz.act_31_webview_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicial)

        var etNombre = findViewById<TextView>(R.id.editT1)
        var btAdelante = findViewById<Button>(R.id.botonAdelante)
        var btTareas = findViewById<Button>(R.id.botonTareas)

        // 'intent' es el intermediario cuando una actividad llama a otra. Los parametros
        // 'extra' que se le añaden
        val intentMuestraNombre = Intent(this, ActMuestraNombre::class.java)
        intentMuestraNombre.putExtra("Nombre", etNombre.text)
        btAdelante.setOnClickListener{startActivity(intentMuestraNombre)}

        val intentListaTareas = Intent(this, ActListaDeTareas::class.java)
        btTareas.setOnClickListener { startActivity(intentListaTareas) }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}