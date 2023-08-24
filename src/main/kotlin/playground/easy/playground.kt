package playground.easy

import java.util.Scanner

//Hardcoded numbers and variables
//1) Hello, world!
fun helloWorld() {
    println("Hello, World!")
}

//2) Variables and Data Types
fun variableTypes() {
    val message = "Hello"
    var count = 10
        count = 20// Mutable variable can be reassigned
    println("$message, World! The count is $count.")
}

//3) Functions
fun functionGreetUser(name: String) : String {
    return "Hello, $name! Nice to meet you!"
}

fun functionMain() {
    val message = functionGreetUser("jerjerking")
    println(message)
}

//4) Conditional Statements
fun maxNumbers(i: Int, j: Int) : Int {
    return if (i > j) {
            i
    } else {
        j
    }
}

fun mainMaxNumbers() {
    val selectedNumbers = maxNumbers(1, 2)
    println("The maximum value is $selectedNumbers.")
}

//5) Loops
fun loopingNumbers() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println("Printing numbers using for loop")
    for (number in numbers) {
        println(number)
    }
    println("\nPrinting numbers using foreach loop")
    numbers.forEach {number ->
        println(number)
    }
}

//User-input
//1) Functions
fun functionGreetings(name: String): String {
    return "Hello, $name!"
}

fun functionGreetUserInput() {
    val scanner = Scanner(System.`in`)

    print("Enter your name: ")
    val userName = scanner.nextLine()

    val message = functionGreetings(userName)
    println(message)
}

//2) Conditionals
fun maxNumbersUserInput(i: Int, j: Int): Int {
    return if (i > j) {
        i
    } else {
        j
    }
}

fun mainMaxNumbersUserInput() {
    val scanner = Scanner(System.`in`)

    print("Enter the first number: ")
    val number1 = scanner.nextInt()

    print("Enter the second number: ")
    val number2 = scanner.nextInt()

    val selectedNumbers = maxNumbersUserInput(number1, number2)
    println("The maximum value between $number1 and $number2 is $selectedNumbers.")
}

//3) Loops
fun loopingNumbersUserInput() {
    val scanner = Scanner(System.`in`)

    // Input the list of numbers
    val numbers = mutableListOf<Int>()
    print("Enter the number of elements: ")
    val count = scanner.nextInt()
    println("Enter $count numbers:")
    repeat(count) {
        val number = scanner.nextInt()
        numbers.add(number)
    }

    // Print numbers using for loop
    println("\nPrinting numbers using for loop")
    for (number in numbers) {
        println(number)
    }

    // Print numbers using forEach loop
    println("\nPrinting numbers using forEach loop")
    numbers.forEach { number ->
        println(number)
    }
}

fun main() {
    var shouldExit = false
    val scanner = Scanner(System.`in`) // Create the scanner here

    while (!shouldExit) {
        println("Choose an option:")
        println("1) Hello, world!")
        println("2) Variables and Data Types")
        println("3) Functions")
        println("4) Conditionals")
        println("5) Loops")
        println("6) User-input Functions")
        println("7) User-input Conditionals")
        println("8) User-input Loops")
        println("9) Exit")
        print("Answer: ")

        val choice = readLine()?.toIntOrNull() ?: 0

        when (choice) {
            1 -> helloWorld()
            2 -> variableTypes()
            3 -> functionMain()
            4 -> mainMaxNumbers()
            5 -> loopingNumbers()
            6 -> functionGreetUserInput()
            7 -> mainMaxNumbersUserInput()
            8 -> loopingNumbersUserInput()
            9 -> shouldExit = true
            else -> println("Invalid choice. Please select a valid option.\n")
        }
    }
    scanner.close() // Close the scanner only once, after the loop
}