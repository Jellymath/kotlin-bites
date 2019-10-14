fun getSomething(created: Boolean): String = "created: $created"

fun getSomething(): Boolean = true

fun main() {
    getSomething(created = true)
}