package com.example.googleplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detalhes2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes2)
        setSupportActionBar(findViewById(R.id.toolbar))
      val imagem = findViewById<ImageView>(R.id.id_img)
        val titulo = findViewById<TextView>(R.id.titulo)
        val info = findViewById<TextView>(R.id.info)
        val sinopse = findViewById<TextView>(R.id.sinopse)
        val direcao = findViewById<TextView>(R.id.direcao)

        val idimagem = intent.getIntExtra("id_img", 0)
       val idtitulo = intent.getStringExtra("titulo")
       val idinfo = intent.getStringExtra("info")
       val idsinopse = intent.getStringExtra("sinopse")
       val iddirecao = intent.getStringExtra("direcao")

        imagem.setImageResource(idimagem)
        titulo.setText(idtitulo)
        info.setText(idinfo)
        sinopse.setText(idsinopse)
        direcao.setText(iddirecao)
    }
}