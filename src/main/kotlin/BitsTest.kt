fun main() {
    println(Bits.values().map(Bits::bitMask))

    val (first, second, third, fourth) = List(4) { 1 shl it }
    println("$first $second $third $fourth")
}

enum class Bits {
    First, Second, Third, Fourth;

    val bitMask get() = 1 shl ordinal
}
