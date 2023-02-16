package com.example.kertasbatugunting

import kotlin.random.Random

object Gameees {

    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false
    )

    private val options = listOf("ROCK","SCISSORS","PAPER")

    private val optionDrawable = mapOf(
        "ROCK" to R.drawable.ic_batu,
        "SCISSORS" to R.drawable.ic_gunting,
        "PAPER" to R.drawable.ic_kertas,
    )


    fun randomOption() : String = options[Random.nextInt(0,3)]

    fun pickDrawable(option : String) : Int = optionDrawable[option]!!

    fun isDraw(player : String, com : String) : Boolean = player == com

    fun isWin(player: String, com: String) : Boolean = rules["$player-$com"]!!
}