package com.example.aplikasi_uts_mobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(val namaBerita : Array<String>, val imageBerita : Array<Int>, val descBerita : Array<String>) : RecyclerView.Adapter<FilmAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvBerita = view.findViewById<TextView>(R.id.tvw_title)
        val imageBerita = view.findViewById<ImageView>(R.id.img_news)
        val descBerita = view.findViewById<TextView>(R.id.tvw_Desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_film,parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return namaBerita.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvBerita.text = namaBerita[position]
        holder.descBerita.text = descBerita[position]
        holder.imageBerita.setImageResource(imageBerita[position])
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "${namaBerita[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}