package org.example.lesson3

fun main(){
    val firstName = "Татьяна"
    var secondName = "Андреева"
    val patronymic = "Сергеевна"
    var age = 20

    println("ФИО: $secondName $firstName $patronymic, Age: $age")

    secondName = "Сидорова"
    age = 22

    println("ФИО: $secondName $firstName $patronymic, Age: $age")
}