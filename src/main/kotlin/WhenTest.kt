fun whenAlt(vararg predicateToAction: Pair<() -> Boolean, () -> Unit>) {
    predicateToAction.find { (predicate, _) -> predicate() }?.let { it.second() }
}

fun main() {
    whenAlt(
        { 5 > 6 } to { println("5 > 6") },
        { 5 < 4 } to { println("5 < 4") },
        { 5 > 4 } to { println("5 > 4") }
    )
}