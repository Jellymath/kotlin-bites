fun <T> Iterable<T>.scan(transform: (acc: T, current: T) -> T): List<T> {
    val result = if (this is Collection) ArrayList<T>(size + 1) else ArrayList()
    for (current in this) {
        result += result.lastOrNull()?.let { transform(it, current) } ?: current
    }
    return result
}

fun main() {
    with(1..10) {
        println(reduce(Int::plus))
        println(scan(Int::plus))
    }
}