import java.time.Duration
import java.util.concurrent.TimeUnit.SECONDS
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

@ExperimentalTime
fun main() {
    println(Duration.ofSeconds(5).toMillis())
    println(SECONDS.toMillis(5))
    println(5.seconds.toLongMilliseconds())
}