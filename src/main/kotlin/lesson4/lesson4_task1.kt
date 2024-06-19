package org.example.lesson4

const val Count_Table = 13

fun main() {
    val todayFreeTables = 0
    val tomorrowFreeTables = 4
    var freeTables: Boolean

    if (tomorrowFreeTables == 0) {
        freeTables = false
        println("Доступность столиков на завтра: $freeTables")
    } else {
        freeTables = true
        println("Доступность столиков на завтра: $freeTables")
    }

    if (todayFreeTables == 0) {
        freeTables = false
        println("Доступность столиков на сегодня: $freeTables")
    } else {
        freeTables = true
        println("Доступность столиков на сегодня: $freeTables")
    }
}