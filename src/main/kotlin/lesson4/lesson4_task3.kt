package org.example.lesson4

fun main() {
    val isSunnyToday = true
    val isTentOpen = true
    val airHumidity = 20
    val yearSeason = "Зима"
    var isGoodForBeans: Boolean

    if (isSunnyToday == true
        && isTentOpen == true
        && airHumidity == 20
        && yearSeason.equals("Лето")
        || yearSeason.equals("Осень")
        || yearSeason.equals("Весна")
    ) {
        isGoodForBeans = true
        println("Благоприятные ли условия сейчас для роста бобовых? $isGoodForBeans")
    } else {
        isGoodForBeans = false
        println("Благоприятные ли условия сейчас для роста бобовых? $isGoodForBeans")
    }
}