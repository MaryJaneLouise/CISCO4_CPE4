package lectures.classes.ClassPackages

class OuterInnerClassExample {
    private val outerProperty: Int = 10

    inner class Inner {
        fun accessOuterProperty() {
            println("Accessing outer property: $outerProperty")
        }
    }
}