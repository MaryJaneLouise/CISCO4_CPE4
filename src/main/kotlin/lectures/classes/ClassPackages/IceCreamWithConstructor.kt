package lectures.classes.ClassPackages

class IceCreamWithConstructor {
    //init will be always prioritized
    init{
        println("Init initializing")
    }

    constructor(){
        println("Constructor Initializing...")
    }

    //MEMBER VARIABLES
    var brand: String = ""
    var cost: Double = 0.0
    var flavor: String = ""

    //MEMBER FUNCTIONS
    fun printDetails(){
        println("The ice cream is $brand the flavor is $flavor that cost $cost")
    }
}