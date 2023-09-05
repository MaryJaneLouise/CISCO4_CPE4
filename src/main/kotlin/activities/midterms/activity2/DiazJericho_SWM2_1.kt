package activities.midterms.activity2

data class Post(
    val username : String,
    val content : String,
    val likesPost : Int,
    val datePosted : String) {
    fun printPost() {
        println("@$username | $datePosted")
        println("$content")
        println("Liked by $likesPost persons")
    }
}
fun main() {
    val listOfPost = listOf(
        Post("chupaghettiJe", "Battery Save mode on, fellas!", 1000, "2023-09-05"),
        Post("hammyHotdog", "Russian go brr!", 6969, "2023-08-05"),
        Post("jonelFishy", "I love goldfish <333", 888, "2023-09-04"),
        Post("blytheBullets", "I need more bullets here guys :((", 9696, "2022-09-05"),
        Post("marqueeBBC", "YOLO!", 69, "2023-09-01"),
        Post("jujuonthebeat", "Tantan is life", 143, "2023-09-03")
    )

    println("Posts sorted by likes")
    val sortedByLikes = listOfPost.sortedByDescending { it.likesPost }
    for (post in sortedByLikes) {
        post.printPost()
        println()
    }

    println("\nPosts sorted by dates")
    val sortedByDate = listOfPost.sortedBy { it.datePosted }
    for (post in sortedByDate) {
        post.printPost()
        println()
    }
}