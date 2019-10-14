import java.util.*

fun main() {
    val list = listOf(1, 2, 3)
    val synchronizedList = Collections.synchronizedList(list)
    println(synchronizedList.isNotEmpty())
}