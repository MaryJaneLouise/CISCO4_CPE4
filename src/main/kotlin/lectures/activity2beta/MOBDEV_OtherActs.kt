package lectures.activity2beta

import lectures.activity2beta.classes.Calculator
import lectures.activity2beta.classes.Dice

fun calculatorClass() {
    val calculator = Calculator()
    calculator.printResults()
}

fun diceClass() {
    val dice6 = Dice(6)
    val dice20 = Dice(20)
    val dice40 = Dice(40)

    println("Rolling 6-sided dice:")
    dice6.roll()
    println()

    println("Rolling 20-sided dice:")
    dice20.roll()
    println()

    println("Rolling 40-sided dice:")
    dice40.roll()
    println()
}

fun main() {
    var shouldExit = false

    while(!shouldExit) {
        println("CISCO4_SWM2")
        println("Choose an option:")
        println("1) Calculator")
        println("2) Dice")
        println("3) Exit")
        print("Answer: ")

        val choice = readln().toIntOrNull()

        if (choice != null) {
            when (choice) {
                1 -> calculatorClass()
                2 -> diceClass()
                3 -> shouldExit = true
                else -> println("Invalid choice. Please select a valid option.\n")
            }
        } else {
            println("Invalid input. Please enter a valid option.\n")
        }
    }
}