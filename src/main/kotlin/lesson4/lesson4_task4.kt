package org.example.lesson4

fun main() {
    var isExercisesArms = false
    var isExercisesLegs = false
    var isExercisesBack = false
    var isExercisesABS = false

    isExercisesArms = true
    isExercisesABS = true

    println(
        "На сегодня нужно выполнить вот такие упражнения:\n" +
                "Упражнения для рук: $isExercisesArms\n" +
                "Упражнения для ног: $isExercisesLegs\n" +
                "Упражнения для спины: $isExercisesBack\n" +
                "Упражнения для пресса: $isExercisesABS"
    )
    println()

    isExercisesArms = false
    isExercisesLegs = true
    isExercisesBack = true
    isExercisesABS = false

    println(
        "На завтра нужно выполнить вот такие упражнения:\n" +
                "Упражнения для рук: $isExercisesArms\n" +
                "Упражнения для ног: $isExercisesLegs\n" +
                "Упражнения для спины: $isExercisesBack\n" +
                "Упражнения для пресса: $isExercisesABS"
    )


}