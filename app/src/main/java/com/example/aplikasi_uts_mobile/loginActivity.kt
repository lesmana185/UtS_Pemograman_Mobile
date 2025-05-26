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

class loginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_acttivity)

//      SINTAK UNTUK KETIKA BUTTON MASUK DI TEKAN DAN TOAST
        val btn_masuk : Button = findViewById(R.id.btn_masuk)
        btn_masuk.setOnClickListener {
            Log.v("cek string","Berhasil Login")
            Toast.makeText(this, "Berhasil Login!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
//      SINTAK UNTUK KETIKA TEXT DAFTAR DI TEKAN
        val textDaftar : TextView = findViewById(R.id.text_daftar)
        textDaftar.setOnClickListener {
            val intent = Intent(this@loginActivity, daftarActivity::class.java)
            startActivity(intent)
        }



    }
}