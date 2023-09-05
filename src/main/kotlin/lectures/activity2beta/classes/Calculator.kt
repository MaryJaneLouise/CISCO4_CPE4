package lectures.activity2beta.classes

class Calculator(var numberOne: Int = 1, var numberTwo: Int = 2) {
    private fun divide(): Int {
        if (numberTwo != 0) {
            return numberOne / numberTwo
        } else {
            println("You can't divide number by 0.")
            return -1
        }
    }

    private fun multiply(): Int {
        return numberOne * numberTwo
    }

    private fun subtract(): Int {
        return numberOne - numberTwo
    }

    private fun addition(): Int {
        return numberOne + numberTwo
    }

    fun printResults() {
        println("Value #1: $numberOne")
        println("Value #2: $numberTwo")
        println("Division Result: ${divide()}")
        println("Multiplication Result: ${multiply()}")
        println("Subtraction Result: ${subtract()}")
        println("Addition Result: ${addition()}")
    }
}
