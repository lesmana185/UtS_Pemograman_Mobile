package com.example.aplikasi_uts_mobile

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


//        SINTAK ARRAY UNTUK MENGISI LIST YANG ADA DI MAIN ACTIVITY
        var namaBerita = arrayOf("Perayaan Malam Tahun Baru Di Tokyo", "Pantai Pangandaran", "Arus Mudik 2024",
            "Kemacetan Menuju Jakarta", "Dukungan Bantuan Covid")
        var descBerita = arrayOf("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since ", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since ", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since ",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since ", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since ", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since ")
        var imageBerita = arrayOf(
            R.drawable.img_news1,
            R.drawable.img_news2,
            R.drawable.img_news3,
            R.drawable.img_news4,
            R.drawable.img_news5,
        )
//          SINTAK VARIABLE UNTUK MENYIMPAN SEMUA ARRAY YANG TELAH DIBUAT
        val beritaAdapter = beritaAdapter(namaBerita, imageBerita, descBerita )

//          SINTAK UNTUK MENAMPILKAN RECYCLERVIEW DI HALAMAN UTAMA
        val rv_berita : RecyclerView = findViewById(R.id.rv_berita)
            rv_berita.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                setHasFixedSize(true)
                adapter = beritaAdapter

            }
    }
}