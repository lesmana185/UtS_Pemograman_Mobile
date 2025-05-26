package com.example.aplikasi_uts_mobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast


class daftarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_daftar)

//      SINTAK UNTUK KETIKA BUTTON DAFTAR DI TEKAN DAN TOAST
        val btn_daftar: Button = findViewById(R.id.btn_daftar)
        btn_daftar.setOnClickListener {
            Log.v("cek string", "Daftar Akun Berhasil")
            Toast.makeText(this, "Daftar Akun Berhasil", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)

//           SINTAK UNTUK KETIKA TEXT DAFTAR DI TEKAN
           val txt_masuk: TextView = findViewById(R.id.txt_masuk)
            txt_masuk.setOnClickListener{
                val intent = Intent(this, loginActivity::class.java)
                startActivity(intent)
       }


        }
    }
}