enum class Color { Red, Green, Blue }

fun main() {
    when(Color.values().random()) {
        Color.Red -> println("red")
        Color.Green -> println("Green")
        else -> return
    }.sealed()
    Throwable()
}

private fun <T> T.sealed() = this