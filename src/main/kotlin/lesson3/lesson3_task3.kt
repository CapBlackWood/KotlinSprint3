package org.example.lesson3

fun main(){
    val multiplicationNumber = 8
    var result: Int

    for (i in 1..9){
        result = multiplicationNumber*i
        println(String.format("%s * %s = %s",multiplicationNumber, i, result))
    }
}