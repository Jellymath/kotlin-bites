import java.util.*
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.round

val scanner = Scanner(System.`in`)

fun main() {
    val a = scanner.nextDouble()
    val b = PI * a.pow(2.0)
    print(round(b).toInt())
}