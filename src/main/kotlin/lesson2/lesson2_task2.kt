package org.example.lesson2

fun main(){
    val workers = 50
    val workerSalary = 30000
    val newWorkers = 30
    val newWorkerSalary = 20000
    val allWorkersSalary: Int
    val allWorkersSalaryWithNewWorkers: Int
    val averageSalary: Int

    allWorkersSalary= workers * workerSalary
    allWorkersSalaryWithNewWorkers= allWorkersSalary + newWorkers * newWorkerSalary
    averageSalary = allWorkersSalaryWithNewWorkers/(workers+newWorkers)

    println(allWorkersSalary)
    println(allWorkersSalaryWithNewWorkers)
    println(averageSalary)
}