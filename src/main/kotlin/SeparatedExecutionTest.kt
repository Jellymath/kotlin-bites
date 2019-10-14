import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.*

@UseExperimental(ExperimentalTime::class)
suspend fun main() {
    val from = MonoClock.markNow()
    val f = separated(1000.milliseconds) { println("Hello") }
    println(from.elapsedNow())
    f()
    println(from.elapsedNow())
    f()
    println(from.elapsedNow())
    delay(2000)
    println(from.elapsedNow())
    f()
    println(from.elapsedNow())
    f()
    println(from.elapsedNow())
}

@ExperimentalTime
fun separated(separateInterval: Duration, f: () -> Unit): () -> Unit {
    var from: ClockMark? = null
    return {
        from.let {
            if (it != null && it.elapsedNow() < separateInterval) {
                runBlocking { delay((separateInterval - it.elapsedNow()).toLongMilliseconds()) }
            }
            from = MonoClock.markNow()
            f()
        }
    }
}