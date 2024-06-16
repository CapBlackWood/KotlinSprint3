package org.example.lesson2

import kotlin.math.pow

fun main(){
    val initialMoney = 70000
    val annualInterestRate = 16.7
    val yearAmount = 20
    val futureMoney:Float

    futureMoney = initialMoney * (1 + annualInterestRate / 100).pow(yearAmount).toFloat()

    println(String.format("%.3f", futureMoney))
}