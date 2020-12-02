package com.itpn.aprenderleer

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import java.util.ArrayList

class SilabasAdaptador(var silabas: ArrayList<SilabasClase>,
                       var cellClickListener: CellClickListener,
                        var context: Context):
                        Adapter<SilabasAdaptador.SilabasViewHolder>() {

    inner class  SilabasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textViewSilaba:TextView = itemView.findViewById(R.id.txSilaba) as TextView
        val imageView:ImageView = itemView.findViewById(R.id.ibTarjeta) as ImageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SilabasViewHolder {
        val v:View = LayoutInflater.from(parent.context).inflate(R.layout.lista_silabas,parent,false)
        return SilabasViewHolder(v)
    }

    override fun onBindViewHolder(holder: SilabasViewHolder, position: Int) {
        val silaba = silabas[position]
        holder.imageView.setImageResource(silaba.imagen)
        holder.textViewSilaba.text = silaba.silaba

        holder.itemView.setOnClickListener {
            cellClickListener.onCellClickListener(data = silaba)
        }
    }

    override fun getItemCount(): Int {
        return silabas.size
    }
}