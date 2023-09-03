package lectures.classes.ClassPackages

class IceCreamBasic {
    //MEMBER VARIABLES
    var brand: String = ""
    var cost: Double = 0.0
    var flavor: String = ""

    //MEMBER FUNCTIONS

    fun printDetails(){
        println("The ice cream is $brand the flavor is $flavor that cost $cost")
    }
}