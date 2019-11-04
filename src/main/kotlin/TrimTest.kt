// https://t.me/kotlin_start/10191
fun main() {
    val original = """
        
        Hello
        Hi
            Bye
        
    """

    val trimmed = original.trim()
    val trimmedWithIndent = original.trimIndent()

    println("----")
    println(trimmed)
    println("----")
    println(trimmed.replace("\n", "\\n"))
    println("----")
    println(trimmedWithIndent)
    println("----")
    println(trimmedWithIndent.replace("\n", "\\n"))
    println("----")
}