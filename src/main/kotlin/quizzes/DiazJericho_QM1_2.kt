package quizzes

class Student(val name: String) {
    fun participateInActivity(activity: String) {
        println("$name participated in $activity")
    }

    fun listActivities() {
        println("$name's Activities:")
        when(name) {
            "Alice" -> println("- Science Fair\n- Chess Club")
            "Bob" -> println("- Soccer Tournament")
        }
    }
}

fun main() {
    val student1 = Student("Alice")
    val student2 = Student("Bob")

    student1.participateInActivity("Science Fair")
    student1.participateInActivity("Chess Club")
    student2.participateInActivity("Soccer Tournament")

    student1.listActivities()
    student2.listActivities()
}