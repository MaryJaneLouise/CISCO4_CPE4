package playground.medium.withoutClass

import java.util.Scanner

fun addition(numberOne : Float, numberTwo : Float) : String {
    val result = numberOne + numberTwo
    return "$numberOne + $numberTwo = $result"
}

fun subtraction(numberOne : Float, numberTwo : Float) : String {
    val result = numberOne - numberTwo
    return "$numberOne - $numberTwo = $result"
}

fun multiplication(numberOne : Float, numberTwo : Float) : String {
    val result = numberOne * numberTwo
    return "$numberOne * $numberTwo = $result"
}

fun division(numberOne : Float, numberTwo : Float) : String {
    if (numberTwo != 0f) {
        val result = numberOne / numberTwo
        return "$numberOne / $numberTwo = ${String.format("%.4f", result)}"
    } else {
        return "You can't divide number by 0."
    }
}
fun main() {
    val scanner = Scanner(System.`in`)
    var continueCalculator = true

    while (continueCalculator) {
        println("Mini Calculator")
        print("Enter first number: ")
        val firstNumber = scanner.nextFloat()

        print("Enter second number: ")
        val secondNumber = scanner.nextFloat()

        println("Select an operation:")
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")
        print("Answer: ")

        val choice = scanner.nextInt()

        when (choice) {
            1 -> println("Result: ${addition(firstNumber, secondNumber)}\n")
            2 -> println("Result: ${subtraction(firstNumber, secondNumber)}\n")
            3 -> println("Result: ${multiplication(firstNumber, secondNumber)}\n")
            4 -> println("Result: ${division(firstNumber, secondNumber)}\n")
            5 -> continueCalculator = false
            else -> println("Invalid choice. Please select a valid option.")
        }
    }
    scanner.close()
}