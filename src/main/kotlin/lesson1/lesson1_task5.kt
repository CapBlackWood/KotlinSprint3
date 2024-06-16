package org.example.lesson1

fun main(){
    var seconds = 6480
    val secondInMinutesAndMinutesInHours = 60
    var minute = seconds/secondInMinutesAndMinutesInHours
    var hour = minute/secondInMinutesAndMinutesInHours

    minute = minute%secondInMinutesAndMinutesInHours
    seconds = seconds%secondInMinutesAndMinutesInHours

    print('0')
    print(hour)
    print(':')
    print(minute)
    print(':')
    print(seconds)
    print('0')
}