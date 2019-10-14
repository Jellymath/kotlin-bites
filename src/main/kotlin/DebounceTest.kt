import kotlinx.coroutines.delay
import kotlin.time.*

@UseExperimental(ExperimentalTime::class)
suspend fun main() {
    val listOf: Iterable<Int> = listOf<Int>(1, 2, 3)
    listOf.map { it * 2 }
    val f = debounce(100.milliseconds) { println("Hello") }
    f()
    f()
    delay(50)
    f()
    delay(100)
    f()
    f()
    delay(200)
    f()
    f()
    f()
    f()
}

@ExperimentalTime
fun debounce(debounceInterval: Duration, f: () -> Unit): () -> Unit {
    var from: ClockMark? = null
     return {
         if (from.let { it == null || it.elapsedNow() > debounceInterval }) {
             from = MonoClock.markNow()
             f()
         }
     }
}