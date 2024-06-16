package org.example.lesson1

fun main(){
    val numberOfOrders: Int = 75
    val notificationAfterOrder: String = "Спасибо за покупку"
    var numberOfWorkers: Int = 2000

    println("Количество заказов: $numberOfOrders")
    println(notificationAfterOrder)
    //println(numberOfWorkers)

    numberOfWorkers = 1999

    println("Количество работников: $numberOfWorkers")
}