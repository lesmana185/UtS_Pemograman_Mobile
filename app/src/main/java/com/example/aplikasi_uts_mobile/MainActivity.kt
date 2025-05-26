package com.example.aplikasi_uts_mobile

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

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

        val filmAdapter = FilmAdapter(namaBerita, imageBerita, descBerita )

        val rv_berita : RecyclerView = findViewById(R.id.rv_berita)
            rv_berita.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                setHasFixedSize(true)
                adapter = filmAdapter




            }
    }
}