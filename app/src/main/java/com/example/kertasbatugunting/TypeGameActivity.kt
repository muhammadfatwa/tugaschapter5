package com.example.kertasbatugunting


import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.kertasbatugunting.databinding.ActivityTypePlayerBinding
import com.google.android.material.snackbar.Snackbar


class TypeGameActivity : AppCompatActivity () {
    private val binding: ActivityTypePlayerBinding by lazy {
        ActivityTypePlayerBinding.inflate(layoutInflater) }
    val name by lazy { intent.getStringExtra("name") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        iniDataView()


    }
    private fun iniDataView() {
      binding.tvPlayer.text="$name" +"VS" + getString(R.string.pemain)
        binding.tvCpu.text="$name" + "VS"+ getString(R.string.com)

        binding.imgVsPlayer.setOnClickListener {
            val intent=Intent(this,PlayerVSPlayer::class.java)
            intent.putExtra("name",name)
            intent.putExtra("type",false)
            startActivity(intent)
        }
        binding.imgVsCpu.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("type",false)
            startActivity(intent)
        }
    }
}







