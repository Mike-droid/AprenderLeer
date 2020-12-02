package com.itpn.aprenderleer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

interface CellClickListener{
    fun onCellClickListener(data: SilabasClase)
}

class Silabas : AppCompatActivity(), CellClickListener {
    var silabaLista : ArrayList<SilabasClase> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_silabas)
        val listaSilabas : RecyclerView = findViewById(R.id.rvSilabas)
        listaSilabas.layoutManager = LinearLayoutManager(this)
        listaSilabas.adapter = SilabasAdaptador(silabaLista,this,this)
        llenarLista()
    }

    fun llenarLista(){
        silabaLista.add(SilabasClase("BA BE BI BO BU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("CA CE CI CO CU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("DA DE DI DO DU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("FA FE FI FO FU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("GA GE GI GO GU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("HA HE HI HO HU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("JA JE JI JO JU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("KA KE KI KO KU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("LA LE LI LO LU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("MA ME MI MO MU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("NA NE NI NO NU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("ÑA ÑE ÑI ÑO ÑU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("PA PE PI PO PU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("QA QE QI QO QU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("RA RE RI RO RU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("SA SE SI SO SU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("TA TE TI TO TU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("VA VE VI VO VU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("WA WE WI WO WU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("XA XE XI XO XU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("YA YE YI YO YU",R.drawable.ic_baseline_play_circle_filled_24))
        silabaLista.add(SilabasClase("ZA ZE ZI ZO ZU",R.drawable.ic_baseline_play_circle_filled_24))
    }

    override fun onCellClickListener(data: SilabasClase) {
        if (data.silaba.equals("BA BE BI BO BU")){
            MediaPlayer.create(this,R.raw.ba).start()
        }
        if (data.silaba.equals("CA CE CI CO CU")){
            MediaPlayer.create(this,R.raw.ca).start()
        }
        if (data.silaba.equals("DA DE DI DO DU")){
            MediaPlayer.create(this,R.raw.da).start()
        }
        if (data.silaba.equals("FA FE FI FO FU")){
            MediaPlayer.create(this,R.raw.fa).start()
        }
        if (data.silaba.equals("GA GE GI GO GU")){
            MediaPlayer.create(this,R.raw.ga).start()
        }
        if (data.silaba.equals("HA HE HI HO HU")){
            MediaPlayer.create(this,R.raw.ha).start()
        }
        if (data.silaba.equals("JA JE JI JO JU")){
            MediaPlayer.create(this,R.raw.ja).start()
        }
        if (data.silaba.equals("KA KE KI KO KU")){
            MediaPlayer.create(this,R.raw.ka).start()
        }
        if (data.silaba.equals("LA LE LI LO LU")){
            MediaPlayer.create(this,R.raw.la).start()
        }
        if (data.silaba.equals("MA ME MI MO MU")){
            MediaPlayer.create(this,R.raw.ma).start()
        }
        if (data.silaba.equals("NA NE NI NO NU")){
            MediaPlayer.create(this,R.raw.na).start()
        }
        if (data.silaba.equals("ÑA ÑE ÑI ÑO ÑU")){
            MediaPlayer.create(this,R.raw.nia).start()
        }
        if (data.silaba.equals("PA PE PI PO PU")){
            MediaPlayer.create(this,R.raw.pa).start()
        }
        if (data.silaba.equals("QA QE QI QO QU")){
            MediaPlayer.create(this,R.raw.qa).start()
        }
        if (data.silaba.equals("RA RE RI RO RU")){
            MediaPlayer.create(this,R.raw.ra).start()
        }
        if (data.silaba.equals("SA SE SI SO SU")){
            MediaPlayer.create(this,R.raw.sa).start()
        }
        if (data.silaba.equals("TA TE TI TO TU")){
            MediaPlayer.create(this,R.raw.ta).start()
        }
        if (data.silaba.equals("VA VE VI VO VU")){
            MediaPlayer.create(this,R.raw.va).start()
        }
        if (data.silaba.equals("WA WE WI WO WU")){
            MediaPlayer.create(this,R.raw.wa).start()
        }
        if (data.silaba.equals("XA XE XI XO XU")){
            MediaPlayer.create(this,R.raw.xa).start()
        }
        if (data.silaba.equals("YA YE YI YO YU")){
            MediaPlayer.create(this,R.raw.ya).start()
        }
        if (data.silaba.equals("ZA ZE ZI ZO ZU")){
            MediaPlayer.create(this,R.raw.za).start()
        }
    }
}