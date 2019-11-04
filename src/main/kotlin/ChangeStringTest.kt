// https://t.me/kotlin_start/4624

import kotlin.reflect.KMutableProperty0

var str: String = ""
fun main() {
    ::str.mutate()
    require(str == "Hello World")
}

fun KMutableProperty0<String>.mutate() = set("Hello World")
