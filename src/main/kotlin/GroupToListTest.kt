fun main() {
    val list = listOf(1, 1, 2, 3, 3)
    val result1 = list.groupBy { it }.values.toList()
    val result2 = mutableListOf<MutableList<Int>>()
    for (current in list) {
        if (result2.isEmpty() || result2.last().first() != current) {
            result2 += mutableListOf(current)
        } else {
            result2.last() += current
        }
    }

    val result3 = list.fold(mutableListOf<MutableList<Int>>()) { acc, current ->
        acc.apply {
            if (isEmpty() || last().first() != current) {
                add(mutableListOf(current))
            } else {
                last() += current
            }
        }
    }

    println(result1)
    println(result2)
    println(result3)
}