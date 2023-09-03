package lectures.classes.ClassPackages

//Regular Class
class PersonDataClass(val name: String, var age: Int) {
    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

// Data class
data class Book(val title: String, val author: String)
