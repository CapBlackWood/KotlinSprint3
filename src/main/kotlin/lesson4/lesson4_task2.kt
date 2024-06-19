package org.example.lesson4

const val Min_Average_Weight = 35
const val Max_Average_Weight = 100
const val Max_Average_Volume = 100

fun main() {
    val firstGoodsWeight = 20
    val firstGoodsVolume = 80
    val secondGoodsWeight = 50
    val secondGoodsVolume = 100
    var isAverage: Boolean

    if (Min_Average_Weight < firstGoodsWeight && firstGoodsVolume <= Max_Average_Weight && firstGoodsVolume < Max_Average_Volume) {
        isAverage = true
        println("Груз с весом $firstGoodsWeight кг и объемом $firstGoodsVolume л соответствует категории 'Average': $isAverage")
    } else {
        isAverage = false
        println("Груз с весом $firstGoodsWeight кг и объемом $firstGoodsVolume л соответствует категории 'Average': $isAverage")
    }

    if (Min_Average_Weight < secondGoodsWeight && firstGoodsVolume <= Max_Average_Weight && secondGoodsVolume < Max_Average_Volume) {
        isAverage = true
        println("Груз с весом $secondGoodsWeight кг и объемом $secondGoodsVolume л соответствует категории 'Average': $isAverage")
    } else {
        isAverage = false
        println("Груз с весом $secondGoodsWeight кг и объемом $secondGoodsVolume л соответствует категории 'Average': $isAverage")
    }


}