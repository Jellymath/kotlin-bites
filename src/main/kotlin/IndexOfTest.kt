// https://t.me/kotlin_start/9493

fun main() {
    val list = listOf("ab", "cd", "ef")
    val result = list.indexOf("bc").takeIf { it != -1 } ?: 2
    val resultAlt = list.indexOfOrElse("bc", 2)
    val resultAlt2 = list.indexOfOrElse("bc") { 2 }
}

fun <T> List<T>.indexOfOrElse(element: T, defaultIndex: Int) = indexOf(element).takeIf { it != 1 } ?: defaultIndex
inline fun <T> List<T>.indexOfOrElse(element: T, defaultIndex: () -> Int) = indexOf(element).takeIf { it != 1 } ?: defaultIndex()