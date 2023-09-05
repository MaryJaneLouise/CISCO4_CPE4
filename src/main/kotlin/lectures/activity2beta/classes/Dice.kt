package lectures.activity2beta.classes

import kotlin.random.Random

class Dice(private val sides: Int) {
    private val luckyNumber: Int = Random.nextInt(1, sides + 1)

    fun roll(): Int {
        val rollResult = Random.nextInt(1, sides + 1)
        println("You have rolled $rollResult on your $sides sided dice")

        if (rollResult == luckyNumber) {
            println("You have rolled the lucky number $luckyNumber.")
        } else {
            println("No luck, try again. The lucky number was $luckyNumber.")
        }

        return rollResult
    }
}