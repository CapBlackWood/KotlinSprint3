package org.example.lesson2

import kotlin.math.roundToInt

const val miningBuff = 1.2

fun main(){
    val crystalOre = 7
    val ironOre = 11
    val bonusCrystalOre: Int
    val bonusIronOre: Int

    bonusCrystalOre = (crystalOre * miningBuff - crystalOre).roundToInt()
    bonusIronOre = (ironOre * miningBuff - ironOre).roundToInt()

    println("Бонусная кристальная руда: $bonusCrystalOre")
    println("Бонусная железная руда: $bonusIronOre")
}