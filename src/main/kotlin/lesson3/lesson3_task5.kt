package org.example.lesson3


fun main(){
    var playerMove = "D2-D4;0"
    val parts = playerMove.split("-",";")

    println("""
        Откуда: ${parts[0]}
        Куда: ${parts[1]}
        Номер хода: ${parts[2]}
    """.trimIndent())

}