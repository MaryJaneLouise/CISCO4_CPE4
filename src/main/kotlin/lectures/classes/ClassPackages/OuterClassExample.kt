package lectures.classes.ClassPackages

class Outer {
    private val outerProperty: Int = 10

    class Nested {
        fun accessOuterProperty(outer: Outer) {
            println("Accessing outer property: ${outer.outerProperty}")
        }
    }
}