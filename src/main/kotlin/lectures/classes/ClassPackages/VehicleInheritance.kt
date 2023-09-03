package lectures.classes.ClassPackages

open class VehicleInheritance(val brand: String, val model: String) {
    open fun startEngine() {
        println("Starting the engine of $brand $model")
    }
}

class Car(brand: String, model: String, val year: Int) : VehicleInheritance(brand, model) {
    fun drive() {
        println("Driving the $year $brand $model")
    }
}