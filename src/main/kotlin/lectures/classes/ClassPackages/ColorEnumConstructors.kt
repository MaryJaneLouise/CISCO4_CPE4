package lectures.classes.ClassPackages

//ENUM CAN HAVE CONSTRUCTORS
enum class ColorEnumConstructors(var colorName : String, var colorValue : Int) {
    //NEED TO ADD CONSTRUCTORS IN OBJECTS ALSO AS THEY ARE OBJECTS OF ENUM CLASS
    RED("Red", 10),
    BLUE("Blue", 20),
    GREEN("Green", 30)
}