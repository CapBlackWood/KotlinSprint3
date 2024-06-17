package org.example.lesson4

const val minAverageWeight = 35
const val maxAverageWeight = 100
const val maxAverageVolume = 100

fun main(){
    val firstGoodsWeight = 20
    val firstGoodsVolume = 80
    val secondGoodsWeight = 50
    val secondGoodsVolume = 100
    var isAverage: Boolean

    if (minAverageWeight<firstGoodsWeight&&firstGoodsVolume<=maxAverageWeight&&firstGoodsVolume<maxAverageVolume){
        isAverage = true
        println("Груз с весом $firstGoodsWeight кг и объемом $firstGoodsVolume л соответствует категории 'Average': $isAverage")
    }else{
        isAverage = false
        println("Груз с весом $firstGoodsWeight кг и объемом $firstGoodsVolume л соответствует категории 'Average': $isAverage")
    }

    if (minAverageWeight<secondGoodsWeight&&firstGoodsVolume<=maxAverageWeight&&secondGoodsVolume<maxAverageVolume){
        isAverage = true
        println("Груз с весом $secondGoodsWeight кг и объемом $secondGoodsVolume л соответствует категории 'Average': $isAverage")
    }else{
        isAverage = false
        println("Груз с весом $secondGoodsWeight кг и объемом $secondGoodsVolume л соответствует категории 'Average': $isAverage")
    }


}