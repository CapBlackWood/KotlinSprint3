package org.example.lesson2

const val minutesInHour = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457
    var arrivalHour: Int
    var arrivalMinute: Int

    arrivalHour = (travelTime + departureMinute) / minutesInHour + departureHour
    arrivalMinute = (travelTime + departureMinute) % minutesInHour

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}