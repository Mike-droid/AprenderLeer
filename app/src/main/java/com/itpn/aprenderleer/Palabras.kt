package com.itpn.aprenderleer

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.intellij.lang.annotations.Language
import java.util.*

class Palabras : AppCompatActivity(), TextToSpeech.OnInitListener {
    lateinit var c : Conexion
    lateinit var textToSpeech: TextToSpeech
    lateinit var localEspanol:Locale
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palabras)

        c = Conexion(this,"RandomWords",null,1)

        insertar()

        val botonLeer = findViewById<Button>(R.id.ttsButton)
        textToSpeech = TextToSpeech(this,this)
        botonLeer.setOnClickListener {
            val palabraRandom : TextView = findViewById(R.id.tvRandomWord)
            val texto = palabraRandom.text.toString()
            textToSpeech.speak(texto,TextToSpeech.QUEUE_FLUSH,null)
        }
    }

    fun consultar(v: View){
        val randomNumber = (0..101).random() //Genera un número aleatorio entre 0 y 100
        val op:SQLiteDatabase = c.readableDatabase
        val cursor:Cursor = op.rawQuery("SELECT `palabras` FROM `MiTabla` WHERE `id` = $randomNumber LIMIT 1",null)
        cursor.moveToFirst()
        var resultado:String = cursor.getString(cursor.getColumnIndex("palabras"))
        var tvRandomWord : TextView = findViewById(R.id.tvRandomWord)
        tvRandomWord.text = resultado
        op.close()
    }

    fun insertar(){
        val op: SQLiteDatabase = c.writableDatabase
        op.execSQL("INSERT INTO `MiTabla` (`palabras`) VALUES (\"ipsum\"),(\"vitae\"),(\"rutrum\"),(\"Donec\"),(\"molestie\"),(\"gravida\"),(\"rutrum\"),(\"ante\"),(\"Donec\"),(\"pede\"),(\"eget\"),(\"pellentesque\"),(\"at\"),(\"natoque\"),(\"Etiam\"),(\"urna\"),(\"nec\"),(\"lacus\"),(\"massa\"),(\"quam\"),(\"ullamcorper\"),(\"nec\"),(\"orci\"),(\"elit\"),(\"eu\"),(\"Praesent\"),(\"cursus\"),(\"odio\"),(\"convallis\"),(\"nascetur\"),(\"Nunc\"),(\"Morbi\"),(\"pede\"),(\"porttitor\"),(\"pellentesque\"),(\"tincidunt\"),(\"Mauris\"),(\"lacinia\"),(\"Donec\"),(\"non\"),(\"bibendum\"),(\"turpis\"),(\"nibh\"),(\"orci\"),(\"porttitor\"),(\"dui\"),(\"fermentum\"),(\"lorem\"),(\"diam\"),(\"et\"),(\"sit\"),(\"sem\"),(\"Mauris\"),(\"ut\"),(\"est\"),(\"eu\"),(\"Donec\"),(\"orci\"),(\"nec\"),(\"Mauris\"),(\"non\"),(\"Aliquam\"),(\"quis\"),(\"posuere\"),(\"tincidunt\"),(\"vel\"),(\"tempus\"),(\"non\"),(\"Phasellus\"),(\"nunc\"),(\"purus\"),(\"arcu\"),(\"risus\"),(\"aliquet\"),(\"Duis\"),(\"sem\"),(\"sed\"),(\"at\"),(\"quam\"),(\"facilisis\"),(\"erat\"),(\"cursus\"),(\"montes\"),(\"Morbi\"),(\"nec\"),(\"fringilla\"),(\"nec\"),(\"consectetuer\"),(\"consequat\"),(\"ut\"),(\"gravida\"),(\"varius\"),(\"Cras\"),(\"nisi\"),(\"egestas\"),(\"arcu\"),(\"neque\"),(\"varius\"),(\"eget\"),(\"Duis\"),(\"Duis\");")
        op.close()
    }

    override fun onInit(p0: Int) {
        localEspanol = Locale("es","ES")
        if (p0 == TextToSpeech.SUCCESS){
            val res:Int = textToSpeech.setLanguage(localEspanol)
            if (res == TextToSpeech.LANG_MISSING_DATA || res == TextToSpeech.LANG_NOT_SUPPORTED){
                Toast.makeText(this,"Lenguaje no soportado",Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(this,"Error al inicializar",Toast.LENGTH_LONG).show()
        }
    }

    fun reproducirPrueba(v:View){
        MediaPlayer.create(this,R.raw.prueba).start()
    }
}