package org.example.lesson3

fun main(){
    var from = "E2"
    var to = "E4"
    var strokeNumber = 1
    var whitesMove = "Игрок белых переместил фигуру с $from на $to. Номер хода: $strokeNumber"

    println(whitesMove)

    from = "D2"
    to = "D4"
    strokeNumber = 2

    whitesMove = "Игрок белых переместил фигуру с $from на $to. Номер хода: $strokeNumber"

    println(whitesMove)

}