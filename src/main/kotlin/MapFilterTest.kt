fun main() {
    val map = mapOf(
        "v[k][1]" to "something",
        "v[k][2]" to "somewhere",
        "v[c][1]" to "someone",
        "v[c][2]" to "somebody",
        "v[p][n]" to "secure"
    )

    val droppedPrefixes = listOf("v[k]", "v[c]")

    val filtered = map.filterKeys { key -> droppedPrefixes.none { key.startsWith(it) } }

    val mutableMap = map.toMutableMap()
    val droppedKeys = mutableMap.keys.filter { key -> droppedPrefixes.any { key.startsWith(it) } }
    mutableMap.keys.removeAll(droppedKeys)

    println(map.toMutableMap().apply {
        removeKeysIf { key -> droppedPrefixes.any { key.startsWith(it) } }
    })
}

inline fun <K, V> MutableMap<K, V>.removeKeysIf(predicate: (K) -> Boolean) {
    val each = keys.iterator()
    while (each.hasNext()) {
        if (predicate(each.next())) {
            each.remove()
        }
    }
}