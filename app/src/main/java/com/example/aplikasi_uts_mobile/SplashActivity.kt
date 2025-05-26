package com.example.aplikasi_uts_mobile

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

//        SINTAK UNTUK MELANJUTKAN KE LOGIN ACTIVITY DAN WAKTU SPLASHACTIVITY
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, loginActivity::class.java))
            finish()
        },3000)


    }
}