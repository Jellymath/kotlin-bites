data class Ft(val id: String)

val idToPosition = mapOf(
    "KEY1" to 1,
    "KEY2" to 2,
    "KEY3" to 3
)

val selector: (Ft) -> Int? = { it.id.let(idToPosition::get) }
val comparator: Comparator<Ft> = Comparator { ft1, ft2 -> nullsLast<Int>().compare(selector(ft1), selector(ft2)) }

val altComparator: Comparator<Ft> = compareBy(nullsLast<Int>()) { it.id.let(idToPosition::get) }
//    Comparator { ft1, ft2 -> compareValuesBy(ft1, ft2, nullsLast()) { it.id.let(idToPosition::get) } }

fun main() {
    val fts = listOf(Ft("KEY3"), Ft("KEY1"), Ft("KEY4"))
    println(fts.sortedWith(comparator))
}
