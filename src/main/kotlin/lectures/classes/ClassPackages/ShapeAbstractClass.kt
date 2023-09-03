package lectures.classes.ClassPackages

abstract class Shape(val name: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double

    fun displayInfo() {
        println("Name: $name")
        println("Area: ${calculateArea()}")
        println("Perimeter: ${calculatePerimeter()}")
    }
}

// Concrete subclass: Circle
class Circle(name: String, val radius: Double) : Shape(name) {
    override fun calculateArea(): Double {
        return 3.14 * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * 3.14 * radius
    }
}

// Concrete subclass: Rectangle
class Rectangle(name: String, val width: Double, val height: Double) : Shape(name) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}