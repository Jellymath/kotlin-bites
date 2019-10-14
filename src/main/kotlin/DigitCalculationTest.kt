import kotlin.math.absoluteValue


fun main() {
    (-121263).run {
        println("lastDigit = $lastDigit")
        println("firstDigit = $firstDigit")
        println("digitCount = $digitCount")
        repeat(digitCount) {
            println("digitFromEnd($it) = ${digitFromEnd(it)}")
        }
        repeat(digitCount) {
            println("digitFromStart($it) = ${digitFromStart(it)}")
        }
    }
}

private val Int.lastDigit: Int
    get() = digitFromEnd(0)

private val Int.firstDigit: Int
    get() {
        var current = absoluteValue
        while (current >= 10) current /= 10
        return current
    }

private val Int.digitCount: Int
    get() {
        var current = absoluteValue
        var result = 1
        while (current >= 10) {
            current /= 10
            result++
        }
        return result
    }

private fun Int.digitFromStart(index: Int): Int {
    require(index >= 0)
    val lastValidIndex = digitCount - 1
    require(index <= lastValidIndex)
    val indexFromEnd = lastValidIndex - index
    return digitFromEnd(indexFromEnd)
}

private fun Int.digitFromEnd(index: Int): Int {
    require(index >= 0)
    var current = absoluteValue
    repeat(index) { current /= 10 }
    return current % 10
}