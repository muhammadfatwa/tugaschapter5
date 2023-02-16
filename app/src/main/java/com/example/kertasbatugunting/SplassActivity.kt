package com.example.kertasbatugunting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide
import com.example.kertasbatugunting.databinding.ActivitySplassBinding

class SplassActivity : AppCompatActivity() {
    private val binding: ActivitySplassBinding by lazy {
        ActivitySplassBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val url = "https://i.ibb.co/HC5ZPgD/splash-screen1.png"
        Glide.with(this).load(url).into(binding.splassecren)

        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this, LadingpageActivity::class.java)
            startActivity(i)
        }, 3000)
    }
}



