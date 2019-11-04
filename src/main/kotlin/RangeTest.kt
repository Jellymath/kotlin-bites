//kinda solves this problem: https://t.me/kotlin_start/7210

import kotlin.random.Random

fun main() {
    val a = Random.nextInt()
    when (a) {
        in 1..55 -> print("F")
        in 0..45 -> print("T")
        in Int.positive -> print("P")
        else -> print("N")
    }
}

val Int.Companion.positive get() = 1..MAX_VALUE
val Int.Companion.nonPositive get() = MIN_VALUE..0
val Int.Companion.negative get() = MIN_VALUE..-1
val Int.Companion.nonNegative get() = 0..MAX_VALUE
