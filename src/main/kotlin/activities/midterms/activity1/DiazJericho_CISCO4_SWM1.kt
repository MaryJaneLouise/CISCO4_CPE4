package activities.midterms.activity1

import java.util.*

//Even or Odd
fun evenOrOdd(){
    println("\nEven or Odd")
    print("Enter the number: ")
    val number = readln().toInt()

    var result = number % 2
    if (result == 0) {
        println("The number is even.")
    } else {
        println("The number is odd.")
    }
}

//Factorials
fun factorialNumber() {
    var factorial = 1

    println("\nFactorial of a number")
    print("Enter a number: ")
    val number = readln().toInt()

    for (i in 1..number) {
        factorial *= i
    }

    println("The factorial of $number is $factorial.")
}

//Greatest Common Divisor
fun greatestCommonDivisor() {
    println("\nGCD")
    print("Enter the first number: ")
    val numberOne = readln().toInt()

    print("Enter the second number: ")
    val numberTwo = readln().toInt()

    var result = 1

    var i = 1
    while (i <= numberOne && i <= numberTwo) {
        if (numberOne % i == 0 && numberTwo % i == 0) {
            result = i
        }
        i++
    }
    println("The GCD of $numberOne and $numberTwo is $result.")
}

//Vowel or Consonant | Easy version
fun vowelOrConsonant() {
    println("\nVowel or Consonant")

    print("Enter a character: ")
    val character = readln()

    if (character.lowercase() == "a" ||
        character.lowercase() == "e" ||
        character.lowercase() == "i" ||
        character.lowercase() == "o" ||
        character.lowercase() == "u") {
        println("The $character is a vowel.")
    } else {
        println("The $character is a consonant.")
    }
}

//Vowel or Consonant | Shite version
fun isVowel(letter: Char) : Boolean {
    val vowels = "AEIOUaeiou"
    return letter in vowels
}

fun vowelOrConsonant2() {
    println("\nVowel Checker")

    print("Enter a sequence of letters: ")
    val inputLetters = readLine() ?: ""

    for (letter in inputLetters) {
        if (letter.isLetter()) {
            if (isVowel(letter)) {
                println("$letter is a vowel.")
            } else {
                println("$letter is a consonant.")
            }
        } else {
            println("$letter is not a valid letter.")
        }
    }
}

//Pascal Triangle
fun pascalTriangle() {
    var coefficient = 1

    println("\nPascal Triangle")
    print("Enter the number of rows for this triangle: ")
    val rowNumber = readln().toInt()

    for (i in 0..rowNumber - 1) {
        for (j in 0..i) {
            if (i == 0 || j == 0) {
                coefficient = 1
            } else {
                coefficient = coefficient *  (i - j + 1) / j
            }
            print("$coefficient\t")
        }
        println()
    }
}

fun main() {
    var shouldExit = false

    while (!shouldExit) {
        println("\nCISCO4_SWM1")
        println("Choose an option:")
        println("1) Even or Odd")
        println("2) Factorial")
        println("3) GCD")
        println("4) Vowel or Consonant")
        println("5) Vowel or Consonant 2")
        println("6) Pascal's Triangle")
        println("7) Exit")
        print("Answer: ")

        val choice = readln().toIntOrNull()

        if (choice != null) {
            when (choice) {
                1 -> evenOrOdd()
                2 -> factorialNumber()
                3 -> greatestCommonDivisor()
                4 -> vowelOrConsonant()
                5 -> vowelOrConsonant2()
                6 -> pascalTriangle()
                7 -> shouldExit = true
                else -> println("Invalid choice. Please select a valid option.\n")
            }
        } else {
            println("Invalid input. Please enter a valid option.\n")
        }
    }
}