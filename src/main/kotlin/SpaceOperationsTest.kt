// https://t.me/kotlin_lang/152949
fun main() {
    val a = listOf(1, 2, 3)
    val b = listOf(3, 4, 5)
    println(a intersect b)
    println(a union b)
    println(a symDiff b)
    println(a - b)
    println(b - a)
}

infix fun <T> Iterable<T>.symDiff(other: Iterable<T>) = (this union other) - (this intersect other)