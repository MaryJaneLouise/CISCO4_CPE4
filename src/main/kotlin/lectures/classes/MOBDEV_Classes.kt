package lectures.classes

import lectures.classes.ClassPackages.*

fun exampleNo16() {
    val outer = OuterInnerClassExample()
    val inner = outer.Inner()

    inner.accessOuterProperty()
}

fun exampleNo15() {
    val outer = Outer()
    val nested = Outer.Nested()

    nested.accessOuterProperty(outer)
}

fun exampleNo14() {
    val circle = Circle("Circle", 5.0)
    val rectangle = Rectangle("Rectangle", 4.0, 6.0)

    println("Circle:")
    circle.displayInfo()

    println("\nRectangle:")
    rectangle.displayInfo()
}

fun exampleNo13() {
    Greeting.grade = 98
    Greeting.greet("Japhet")
    println("Your grade is: ${Greeting.grade}")
}

fun exampleNo12() {
    val creditCardPayment = PaymentMethod.CreditCard("1234-5678-9012-3456")
    val payPalPayment = PaymentMethod.PayPal("alice@example.com")
    val cashPayment = PaymentMethod.Cash

    processPayment(creditCardPayment)
    processPayment(payPalPayment)
    processPayment(cashPayment)
}

fun exampleNo11() {
    for(color in ColorEnumConstructors.values()){
        println(color.colorName + " " + color.colorValue)
    }
}

fun exampleNo10() {
    for(color in ColorEnumBasic.values()){
        println(color.name + " " + color.ordinal)
    }
}

fun exampleNo9() {
    var human = Human()
    human.breath()
    human.eat()
    human.sleep()
}

fun exampleNo8() {
    val person = PersonDataClass("Alice", 30)
    person.greet()

    val book = Book("The Catcher in the Rye", "J.D. Salinger")
    println("Book: $book")
}

fun exampleNo7() {
    val dog = Dog()

    // Call the overridden function in the child class
    dog.makeSound()
}

fun exampleNo6() {
    // Create an instance of the Car class
    val car = Car("Toyota", "Corolla", 2022)

    // Access properties and methods from both parent and child classes
    println("Car details: ${car.brand} ${car.model} ${car.year}")
    car.startEngine()
    car.drive()
}

fun exampleNo5() {
    val iceCream =  IceCreamWithOverlappingConstructors("Selecta", "Starwberry")
    val iceCreamFeedBack =  IceCreamWithOverlappingConstructors("Selecta", "Strawberry","The ice cream is super cold")
    val iceCreamRating =  IceCreamWithOverlappingConstructors("Selecta", "Strawberry", 4.5)
}

fun exampleNo4() {
    //Calling Primary constructor only
    val iceCream = IceCreamWithSeparateConstructors("Selecta", "Strawberry cream")

    //Calling the Primary and secondary constructor
    val iceCreamLarge = IceCreamWithSeparateConstructors("Selecta", "Strawberry cream","Large")

    //Calling the userfeedback constructor
    val iceCreamFeedback = IceCreamWithSeparateConstructors("The is cream is cold")

    //Calling the rating constructor
    val iceCreamRating = IceCreamWithSeparateConstructors(3.5)
}

fun exampleNo3() {
    //Calling Primary constructor only
    val iceCream = IceCreamWithDiffConstructors("Selecta", "Strawberry cream", 69.99)

    //Calling the Primary and secondary constructor
    val iceCreamLarge = IceCreamWithDiffConstructors("Selecta", "Strawberry cream", 69.99, "Large")
}

fun exampleNo2() {
    //Creating the Object
    val iceCream = IceCreamWithConstructor()

    //Accessing Member variables
    iceCream.brand = "Selecta"
    iceCream.cost = 299.99
    iceCream.flavor = "Strawberry cream"

    iceCream.printDetails()
}

fun exampleNo1() {
    //Creating the Object
    val iceCream = IceCreamBasic()

    //Accessing Member variables
    iceCream.brand = "Selecta"
    iceCream.cost = 299.99
    iceCream.flavor = "Strawberry cream"

    iceCream.printDetails()
}
fun main() {
    var shouldExit = false

    while (!shouldExit) {
        println("Classes")
        println("Choose an option:")
        println("1) Basic classes")
        println("2) Classes with Basic Constructors")
        println("3) Classes with Different Constructors")
        println("4) Classes with Separate Constructors")
        println("5) Classes with Overlapping Constructors")
        println("6) Classes with Basic Inheritance")
        println("7) Classes with Basic Inheritance 2")
        println("8) Data Class")
        println("9) Interface Class")
        println("10) Enum Class")
        println("11) Enum Class 2")
        println("12) Sealed Class")
        println("13) Object Class")
        println("14) Abstract Class")
        println("15) Outer Basic Class")
        println("16) Outer & Inner Class")
        print("Answer: ")

        val choice = readln().toIntOrNull()

        if (choice != null) {
            when (choice) {
                1 -> exampleNo1()
                2 -> exampleNo2()
                3 -> exampleNo3()
                4 -> exampleNo4()
                5 -> exampleNo5()
                6 -> exampleNo6()
                7 -> exampleNo7()
                8 -> exampleNo8()
                9 -> exampleNo9()
                10 -> exampleNo10()
                11 -> exampleNo11()
                12 -> exampleNo12()
                13 -> exampleNo13()
                14 -> exampleNo14()
                15 -> exampleNo15()
                16 -> exampleNo16()
                17 -> shouldExit = true
                else -> "Invalid option. Please try again.\n"
            }
        } else {
            println("Invalid input. Please enter a valid option.\n")
        }
    }
}