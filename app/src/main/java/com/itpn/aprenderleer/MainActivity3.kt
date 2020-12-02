package com.itpn.aprenderleer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun abrirLetras(v: View){
        val intentoLetras : Intent = Intent(this,Letras::class.java)
        startActivity(intentoLetras)
    }

    fun abrirSilabas(v:View){
        val intentoSilabas:Intent = Intent(this,Silabas::class.java)
        startActivity(intentoSilabas)
    }

    fun abrirPalabras(v:View){
        val intentoPalabras:Intent = Intent(this,Palabras::class.java)
        startActivity(intentoPalabras)
    }
}