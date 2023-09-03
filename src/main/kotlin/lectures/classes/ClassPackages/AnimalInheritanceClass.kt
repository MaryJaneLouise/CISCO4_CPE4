package lectures.classes.ClassPackages

// Parent class
open class AnimalInheritance {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

// Child class inheriting from Animal
class Dog : AnimalInheritance() {
    override fun makeSound() {
        super.makeSound() // Calling the parent class's makeSound() function
        println("Dog barks")
    }
}