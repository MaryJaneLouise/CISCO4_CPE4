package lectures.classes.ClassPackages

class IceCreamWithOverlappingConstructors(val brand: String, val flavor: String) {
    constructor(brand: String, flavor: String, feedback: String) : this(brand,flavor){
        println("Feedback for $brand with flavor $flavor is [$feedback]")
    }

    constructor(brand: String, flavor: String, rating: Double) : this(brand,flavor){
        println("Rating for $brand with flavor $flavor is [$rating]")
    }
}