package com.example.kertasbatugunting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.kertasbatugunting.databinding.PlayerVsPlayerBinding

class PlayerVSPlayer : AppCompatActivity() {
    private val binding: PlayerVsPlayerBinding by lazy {
        PlayerVsPlayerBinding.inflate(layoutInflater)
    }


    private var currentSuitPlayer: suit? = null
    private var currentSuitCom : suit ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupPlayerAction()

    }

    private fun setupPlayerAction() {
        binding.imPlayerBatu.setOnClickListener {
            currentSuitPlayer= suit.BATU
            setupComAction()

        }
        binding.imPlayerGunting.setOnClickListener {
            currentSuitPlayer = suit.KERTAS
            setupComAction()

        }
        binding.imPlayerKertas.setOnClickListener {
            currentSuitPlayer = suit.GUNTING
            setupComAction()

        }

    }



    private fun setupComAction() {
      currentSuitCom = getArraySuit().random()
        posAction()
    }
    private fun posAction() {
       val textResult = when (currentSuitPlayer) {
           suit.GUNTING-> playerGuntingSlected()
           suit.KERTAS-> playerKertasSlected()
           else -> playerBatuSlected()


        }

        binding.tvResult.text ="kamu$textResult,Comwin$currentSuitCom"

    }
    private fun playerGuntingSlected():String {
        return when(currentSuitCom) {
            suit.GUNTING-> "seri"
            suit.BATU-> "kalah"
            else->"menang"

        }
    }
    private fun playerBatuSlected():String {
        return when(currentSuitCom) {
            suit.GUNTING-> "menang"
            suit.BATU-> "seri"
            else->"kalah"

        }
    }
    private fun playerKertasSlected():String {
        return when(currentSuitCom) {
            suit.GUNTING-> "kalah"
            suit.BATU-> "menang"
            else->"menang"

        }
    }








    private fun getArraySuit(): List<suit> {
        return listOf(suit.BATU,suit.KERTAS,suit.GUNTING)
    }
}