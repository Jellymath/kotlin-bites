import kotlin.math.PI

@JvmName("doSomeInt")
fun List<Int>.doSome(predicate: (Int) -> Boolean) {
    filter(predicate).map { it * it }.forEach(::println)
}

@JvmName("doSomeDouble")
fun List<Double>.doSome(predicate: (Double) -> Boolean) {
    filter(predicate).map { it * PI }.forEach(::println)
}

fun main() {
    listOf(1.0, 2.0, 3.0).doSome { it != 0.0 }
}