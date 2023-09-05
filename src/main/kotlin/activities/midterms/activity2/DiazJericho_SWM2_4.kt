package activities.midterms.activity2

import kotlin.random.Random

open class Character(val name : String, var healthBar : Int, val damageDealth : Int) {
    open fun attack(target : Character) {
        val damageDealt = Random.nextInt(1, damageDealth + 1)
        println("$name attacks ${target.name} with $damageDealt damage!")
        target.takeDamage(damageDealt)
    }

    open fun takeDamage(damageDealth : Int) {
        healthBar -= damageDealth
        if (healthBar <= 0) {
            healthBar = 0
            println("$name has been defeated!")
        } else {
            println("$name has $healthBar health remaining!")
        }
    }
}

class Player(name: String, healthBar: Int, damage: Int) : Character(name, healthBar, damage) {
    fun heal() {
        val healingAmount = Random.nextInt(10, 50)
        healthBar += healingAmount
        println("$name heals for $healingAmount health.")
        println("$name now has $healthBar health.")
    }
}

class Enemy(name: String, health: Int, damage: Int) : Character(name, health, damage) {
    fun heal() {
        val healingAmount = Random.nextInt(10, 50)
        healthBar += healingAmount
        println("$name heals for $healingAmount health.")
        println("$name now has $healthBar health.")
    }
}

class Game(private val player: Player, private val enemy: Enemy) {
    fun play() {
        println("Welcome to the Game!")

        while (player.healthBar > 0 && enemy.healthBar > 0) {
            println("\nOptions:")
            println("1) Attack")
            println("2) Heal")
            println("3) Quit")
            print("Choose an option: ")

            val choice = readln().toIntOrNull()

            when (choice) {
                1 -> {
                    player.attack(enemy)
                    enemy.attack(player)
                }
                2 -> {
                    player.heal()
                    enemy.heal()
                }
                3 -> {
                    println("Thanks for playing!")
                    return
                }
                else -> println("Invalid choice. Please select a valid option.")
            }
        }

        if (player.healthBar <= 0) {
            println("You lose! Game over.")
        } else {
            println("Congratulations! You defeated the enemy.")
        }
    }
}

fun main() {
    val player = Player("Jericho", 150, 20)
    val enemy = Enemy("Hamuel", 150, 25)

    val game = Game(player, enemy)
    game.play()
}
