package lectures.classes.ClassPackages

interface OrganismInterfaceClass {
    //We cannot initialize variables in interface
    var hoursOfSleep:Int
    var foodType:String

    //We may or may not have function body if function body is not in the interface, it must be overriden
    fun eat()
    fun breath()
    fun sleep(){
        println("Hours of Sleep: ${hoursOfSleep}")
    }
}

class Human : OrganismInterfaceClass {
    //We must override properties as they are not defined in the interface
    override var hoursOfSleep: Int = 8
    override var foodType: String = "Meat"

    override fun breath(){
        println("Breathing...")
    }

    override fun eat(){
        println("Eating $foodType food")
    }

    //We may or may not override it as it has a body in the interface
    override fun sleep(){
        super.sleep()
        println("Sleeping...")
    }
}