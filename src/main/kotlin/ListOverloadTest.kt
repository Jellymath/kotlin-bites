operator fun <T> List<T>.get(range: IntRange) = slice(range)


fun main() {
    val list = (1..50).toList()
    println(list[0])
    println(list[10..20])
}