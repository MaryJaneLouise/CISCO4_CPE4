package playground.medium.withClass.Car

class Car {
    var brand : String = ""
    var name : String = ""
    var price : Double = 0.0

    fun printCar() : String {
        return "$brand $name = P$price"
    }
}