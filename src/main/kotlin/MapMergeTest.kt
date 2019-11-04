// https://t.me/kotlin_lang/139439
fun main() {
    val first = mapOf(1 to mapOf("a" to 111, "b" to 121), 3 to mapOf("a" to 2))
    val second = mapOf(1 to mapOf("a" to 411, "c" to 321), 2 to mapOf("a" to 211))
    println(first.merge(second) { l, r -> l.merge(r, Int::plus) })
}

inline fun <T, K> Map<T, K>.merge(other: Map<T, K>, mergeFunction: (K, K) -> K): Map<T, K> {
    val result = hashMapOf<T, K>()
    (this.keys + other.keys).forEach {
        val left = this[it]
        val right = other[it]
        if (left != null && right != null) {
            result[it] = mergeFunction(left, right)
        } else if (left != null) {
            result[it] = left
        } else if (right != null) {
            result[it] = right
        }
    }
    return result
}