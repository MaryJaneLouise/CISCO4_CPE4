package activities.midterms.activity2

import kotlin.math.sqrt

abstract class Shape(val name : String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double

    fun displayInfo() {
        println("Name: $name")
        println("Area: ${calculateArea()}")
        println("Perimeter: ${calculatePerimeter()}")
    }
}

class Circle(name: String, val radius: Double) : Shape(name) {
    override fun calculateArea(): Double {
        return 3.14 * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * 3.14 * radius
    }
}

class Square(name: String, val width: Double, val height: Double) : Shape(name) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

class Triangle(name: String, val sideA : Double, val sideB : Double, val sideC : Double) : Shape(name) {
    override fun calculateArea(): Double {
        val semiPerimeter = (sideA + sideB + sideC) / 2
        val area = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
        return area
    }

    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }
}

fun main() {
    val circle = Circle("Circle", 5.0)
    val square = Square("Square", 4.0, 6.0)
    val triangle = Triangle("Triangle", 3.0, 4.0, 5.0)

    println("Circle:")
    circle.displayInfo()

    println("\nRectangle:")
    square.displayInfo()

    println("\nTriangle:")
    triangle.displayInfo()
}