package quizzes

interface MealBuilder {
    fun setName(name: String): MealBuilder
    fun setMainCourse(mainCourse: String): MealBuilder
    fun setSideDish(sideDish: String): MealBuilder
    fun setDessert(dessert: String): MealBuilder
    fun setDrink(drink: String): MealBuilder
    fun build(): Meal
}

data class Meal(
    val name: String,
    val mainCourse: String,
    val sideDish: String,
    val dessert: String,
    val drink: String
)

class MealBuilderImpl(
    private var name: String = "",
    private var mainCourse: String = "",
    private var sideDish: String = "",
    private var dessert: String = "",
    private var drink: String = "",
) : MealBuilder {
    override fun setName(name: String): MealBuilderImpl {
        this.name = name
        return this
    }
    override fun setMainCourse(mainCourse: String): MealBuilderImpl {
        this.mainCourse = mainCourse
        return this
    }
    override fun setSideDish(sideDish: String): MealBuilderImpl {
        this.sideDish = sideDish
        return this
    }
    override fun setDessert(dessert: String): MealBuilderImpl {
        this.dessert = dessert
        return this
    }
    override fun setDrink(drink: String): MealBuilderImpl {
        this.drink = drink
        return this
    }
    override fun build() = Meal(
        name = name,
        mainCourse = mainCourse,
        sideDish = sideDish,
        dessert = dessert,
        drink = drink,
    )
}

fun main() {
    val mealBuilder: MealBuilder = MealBuilderImpl()
    val meal = mealBuilder
        .setName("Special Dinner")
        .setMainCourse("Grilled Salmon")
        .setSideDish("Roasted Vegetables")
        .setDessert("Chocolate Cake")
        .setDrink("Red Wine")
        .build()

    println("Meal Name: ${meal.name}")
    println("Main Course: ${meal.mainCourse}")
    println("Side Dish: ${meal.sideDish}")
    println("Dessert: ${meal.dessert}")
    println("Drink: ${meal.drink}")
}