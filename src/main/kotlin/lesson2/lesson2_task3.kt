package org.example.lesson2

const val minutesInHour = 60

fun main(){
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457
    var arrivalHour: Int
    var arrivalMinute: Int

    arrivalHour = travelTime / minutesInHour + departureHour
    arrivalMinute = travelTime % minutesInHour +departureMinute

    if (arrivalMinute>= minutesInHour){
       arrivalMinute = arrivalMinute % minutesInHour
        arrivalHour++
    }
    print(arrivalHour)
    print(':')
    print(arrivalMinute)
}