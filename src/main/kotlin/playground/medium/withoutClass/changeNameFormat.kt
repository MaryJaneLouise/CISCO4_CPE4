package playground.medium.withoutClass

import java.util.*

fun formatName(name: String): String {
    val parts = name.split(" ")
    val lastName = parts.last()
    val firstName = parts.dropLast(1).joinToString(" ")
    return "$lastName, $firstName"
}

fun main() {
    println("Name Formatter (Firstname Lastname -> Lastname, Firstname)")
    var continueGenerating = true

    while (continueGenerating) {
        print("Enter the number of names to format: ")
        val count = readln().toInt()

        val names = mutableListOf<String>()
        for (i in 1..count) {
            print("Enter name $i: ")
            val fullName = readln()
            names.add(formatName(fullName))
        }

        println("Formatted names:")
        for (formattedName in names) {
            println(formattedName)
        }

        print("Do you want to generate another set of names? (yes/no): ")
        val generateAgain = readln().lowercase()
        continueGenerating = generateAgain == "yes"
    }
}
