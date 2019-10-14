import kotlin.reflect.typeOf

@ExperimentalStdlibApi
fun main() {
    val type = typeOf<List<List<String>>>()
    println(type)
    println(type.classifier)
    println(type.arguments)
}