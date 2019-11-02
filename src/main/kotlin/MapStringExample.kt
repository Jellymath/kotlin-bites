fun main() {
    val str: String = "abc".map { it + 1 }.joinToString("")
    "abc".mapWithCharToString { it + 1 }
    "abc".filter { it.isDigit() }
//    val value: String = CarImage.removeOther(
//        str.map { CarImage.Translit(Character.toUpperCase(it)) }.joinToString("")
//    )
//        .map { CarImage.Translit(Character.toUpperCase(it)) }
//        .joinToString("")
}
fun String.mapWithCharToString(transform: (Char) -> Char): String =
    map(transform).joinToString("")

fun String.mapToString(transform: (Char) -> CharSequence): String =
    toCharArray().joinToString("", transform = transform)