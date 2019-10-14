package rawMap

class KGenericClassWithMap<T> {
    val map: MutableMap<String, Int> = mutableMapOf("Hello" to 1, "World" to 2)

    fun explicitGetter(): MutableMap<String, Int> = map
}