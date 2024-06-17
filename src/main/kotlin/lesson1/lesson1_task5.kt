package org.example.lesson1

import java.sql.Time

const val secondInMinutesAndMinutesInHours = 60
fun main(){
    var seconds = 6480
    var minute = seconds/secondInMinutesAndMinutesInHours
    val hour = minute/secondInMinutesAndMinutesInHours

    minute = minute%secondInMinutesAndMinutesInHours
    seconds = seconds%secondInMinutesAndMinutesInHours

    val time = Time(hour,minute,seconds)
    println(time)

}