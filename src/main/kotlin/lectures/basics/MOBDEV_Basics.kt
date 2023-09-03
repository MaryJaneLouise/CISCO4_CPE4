package lectures.basics

fun basicDataTypes(){
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    val myString : String = "Hello"

    println(myDoubleNum::class.simpleName)

    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr = IntArray(5)

    // Example of initializing the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr2 = IntArray(5) { 42 }

    // Example of initializing the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialized to their index value)
    val arr3 = IntArray(5) { it * 1 }

    val arr4 = arrayOf(1,2,3,4,5)

    println(arr3[1])
}

fun conditionalStatements(){
    val x = 20
    val y = 18

    //If statements
    if(x > y){
        println("x is greater than y")
    } else{
        println("x is less than y")
    }

    //This is the "switch" counterpart in C/C++/C#
    when (x){
        20 -> println("x is equal to 20")
        19 -> println("x is equal to 19")
        else ->{
            println("x is neither 20 or 19")
        }
    }


    //Another example of when statement
    val name= "Sun"
    when(name) {
        "Sun" -> println("Sun is a Star")
        "Moon" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("I don't know anything about it")
    }

    //Using when as an expression
    val monthOfYear = 2
    val month =
        when(monthOfYear){
        1 -> "January"
        2 -> "February"
        else -> "Unknown month!"
    }
    println(month)
}

fun loopExamples(){
    //Example no. 1
    var languages = arrayOf("C#", "Python", "Java", "Kotlin")

    //Prints all the items in the array
    for(language in languages){
        println(language)
    }

    //Counts all the items from 0 to n where n is the number of the items (indices)
    for(language in languages.indices){
        //This will only print position 0 and 2
        if(language % 2 == 0){
            println(languages[language])
        }
    }

    //Example no. 2
    val message = "This is a string!"

    //Since the text acts like an array, it will print one by one when printed in a loop
    for (letter in message){
        println(letter)
    }


    //Example no. 3
    var x = 1

    //Since the variable x has been initialized to value 1, it will start from 1
    //and will end to 5
    while (x <= 5) {
        println("Line $x")
        x++
    }


    //Example no. 4
    // Program to compute the sum of natural numbers from 1 to 100.
    var sum = 0
    var i = 100

    //In this case, it will compute the sum until such time the variable i will be 0
    while (i != 0) {
        sum += i     // sum = sum + i;
        i--
    }
    println("sum = $sum")


    //Example no. 5
    //Do-While statement
    var v = 0

    do {
        println(v)
        v++
    }
    while (v < 5)
}

fun collectionsExample(){
    //In this example, the list can be edited instead of overwriting it
    val num = mutableListOf("one", "two", "three", "four")
    num.add("five")   // this is OK
    println(num)
    //numbers = mutableListOf("six", "seven")      // compilation error


    //This example shows how to delete the items in an array or list
    val num3 = mutableListOf(1, 2, 3, 4)
    num3.add(5)
    num3.removeAt(1)
    num3[0] = 0
    num3.shuffle()
    println(num3)

    //Sets
    val numbers = setOf(1, 2, 3, 4)  // LinkedHashSet is the default implementation
    val numbersBackwards = setOf(4, 3, 2, 1)

    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())

    //Maps
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous

    val mutableMap = mutableMapOf("one" to 1, "two" to 2)
    mutableMap.put("three", 3)
    mutableMap["one"] = 11

    println(numbersMap)
}

fun main() {
    var shouldExit = false

    while (!shouldExit) {
        println("\nMOBDEV Basic Examples")
        println("Choose an option:")
        println("1) Basic Data Types")
        println("2) Conditional Statements")
        println("3) Loops")
        println("4) Collections / Sets")
        print("Answer: ")

        val choice = readln().toIntOrNull()

        if (choice != null) {
            when (choice) {
                1 -> basicDataTypes()
                2 -> conditionalStatements()
                3 -> loopExamples()
                4 -> collectionsExample()
                5 -> shouldExit = true
                else -> "Invalid option. Please try again.\n"
            }
        } else {
            println("Invalid input. Please enter a valid option.\n")
        }
    }
}