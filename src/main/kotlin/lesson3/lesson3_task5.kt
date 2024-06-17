package org.example.lesson3


fun main(){
    var playerMove = "D2-D4;0"
    val parts = playerMove.split("-",";")

    for (part in parts){
      if (part.length>0){
          println(part)
      }

    }
}