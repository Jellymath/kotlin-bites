fun findFirstUniqueCharacter(inputStr: String): Char? {
    val firstIndexes = mutableMapOf<Char, Int>()
    val lastIndexes = mutableMapOf<Char, Int>()

    for ((i, ch) in inputStr.withIndex()) {
        if (!firstIndexes.containsKey(ch)) firstIndexes[ch] = i
        lastIndexes[ch] = i
    }

    val uniqueChars = firstIndexes.entries.filter { (k, v) -> lastIndexes.getValue(k) == v }
    val firstPair = uniqueChars.minBy { it.value }

    return firstPair?.key
}

fun findFirstUniqueCharacterAlt(inputStr: String): Char? {
    val charToIndexes = LinkedHashMap<Char, Pair<Int, Int>>()
    for ((i, ch) in inputStr.withIndex()) {
        charToIndexes[ch] = charToIndexes[ch]?.let { it.first to i } ?: (i to i)
    }
    return charToIndexes.entries.firstOrNull { (_, indexes) -> indexes.first == indexes.second }?.key
}