package org.example.lesson1

const val secondInMinutesAndMinutesInHours = 60
fun main() {
    var seconds = 6480
    var minute = seconds / secondInMinutesAndMinutesInHours
    val hour = minute / secondInMinutesAndMinutesInHours

    minute = minute % secondInMinutesAndMinutesInHours
    seconds = seconds % secondInMinutesAndMinutesInHours

    println("%02d:%02d:%02d".format(hour, minute, seconds))

}