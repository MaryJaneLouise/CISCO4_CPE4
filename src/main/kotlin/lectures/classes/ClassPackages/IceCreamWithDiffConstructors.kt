package lectures.classes.ClassPackages

class IceCreamWithDiffConstructors(val brand: String, val flavor: String, val price: Double) {
    init{
        println("Brand: $brand, flavor: $flavor, Price: $price")
    }

    constructor(brand: String, flavor:String, price:Double, size: String):this(brand,flavor,price){
        println("Brand: $brand, flavor: $flavor, Price: $price the size is $size")
    }
}