fun main() {
    ifNotNull(1, 2, null, 4, 5) { (first, second, third, fourth, fifth) ->
        println(first + 3 * second + 4 * third - fourth - 2 * fifth)
    }
}

inline fun <T : Any> ifNotNull(vararg params: T?, block: (List<T>) -> Unit) {
    val filtered = params.filterNotNull()
    if (filtered.size == params.size) block(filtered)
}


