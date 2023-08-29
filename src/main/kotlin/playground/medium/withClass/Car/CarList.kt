package playground.medium.withClass.Car

fun main() {
    println("Cars")
    print("Enter the number of cars you want to list: ")
    val carCount = readln().toInt()

    var carList = mutableListOf<Car>()

    for (i in 1..carCount) {
        val car = Car()

        println("Details for car no. $i")
        print("Enter car brand: ")
        car.brand = readln()

        print("Enter car name: ")
        car.name = readln()

        print("Enter car price: ")
        car.price = readln().toDouble()

        carList.add(car)
    }

    println("\nList of cars:")
    for ((index, car) in carList.withIndex()) {
        println("Car #${index + 1}: ${car.printCar()}")
    }
}