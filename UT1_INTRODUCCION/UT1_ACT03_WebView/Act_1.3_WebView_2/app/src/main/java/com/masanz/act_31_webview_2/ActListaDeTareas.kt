package com.masanz.act_31_webview_2

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActListaDeTareas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista_de_tareas)

        val webView1 = findViewById<WebView>(R.id.myWebView)
        var ws = webView1.getSettings()
        ws.javaScriptEnabled =  true
        webView1.loadUrl("file:///android_asset/index.html")

        var intent = Intent(this, ActInicial::class.java)
        val btVolver = webView1.findViewById<Button>(R.id.btVolver)
        btVolver.setOnClickListener{startActivity(intent)}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}