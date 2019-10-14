abstract class SomeClass<A, B: List<A>>

private var adapter: SomeClass<*, *>? = null

fun main() {
    adapter = object: SomeClass<Int, List<Int>>() { }
}