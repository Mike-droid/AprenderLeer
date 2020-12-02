package com.itpn.aprenderleer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class MainActivity2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val videoView:VideoView = findViewById(R.id.videoIntro)

        val ruta:Uri = Uri.parse("android.resource://${packageName}/${R.raw.intro}")

        videoView.setVideoURI(ruta)

        videoView.start()

        val intento:Intent = Intent(this,MainActivity3::class.java)

        videoView.setOnCompletionListener { startActivity(intento) }

    }
}