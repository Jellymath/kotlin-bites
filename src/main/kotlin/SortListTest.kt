// https://t.me/kotlin_start/10088
data class Target(
    val guid: String = "",
    val name: String = "",
    val description: String = "",
    val date: Long = 0L,
    var priority: Int = 0
)

fun main() {
    val targetList = mutableListOf(
        Target("guid1", priority = 0),
        Target("guid2", priority = 2),
        Target("guid3", priority = 3),
        Target("guid4", priority = 1),
        Target("guid5", priority = 2)
    )

    println(targetList)

    targetList.sortByDescending { it.priority }

    println(targetList)
}