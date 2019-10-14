val diceOptions = 1..6

fun main() {
    val n = 1_000_000
    val resultsOdd = (1..n).count { testRandom(3) { it % 2 == 0} }
    val resultsEven = (1..n).count { testRandom(4) { it % 2 == 0} }
    println("results for odd (absolute) = $resultsOdd")
    println("results for even (absolute) = $resultsEven")
    println("results for odd (normalized) = ${resultsOdd * 100.0 / n}%")
    println("results for even (normalized) = ${resultsEven * 100.0 / n}%")
}

fun testRandom(fixTo: Int, spellCondition: (Int) -> Boolean): Boolean =
    test(diceOptions.random(), diceOptions.random(), fixTo, spellCondition)

fun test(first: Int, second: Int, fixTo: Int, spellCondition: (Int) -> Boolean) =
    first == fixTo && spellCondition(second) || second == fixTo && spellCondition(first)