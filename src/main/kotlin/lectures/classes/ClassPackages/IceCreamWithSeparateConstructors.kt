package lectures.classes.ClassPackages

class IceCreamWithSeparateConstructors (val brand: String = "Brand name", val flavor: String = "Flavor") {
    init{
        println("Brand: $brand, flavor: $flavor")
    }

    constructor(brand: String, flavor:String, size: String):this(){
        println("Brand: $brand, flavor: $flavor, the size is $size")
    }

    constructor(userFeedback: String):this(){
        println("The user feedback is: $userFeedback")
    }

    constructor(rating: Double):this(){
        println("The user rating is: $rating")
    }
}