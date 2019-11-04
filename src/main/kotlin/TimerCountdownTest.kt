// https://t.me/kotlin_start/10061

import kotlinx.coroutines.delay
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.minutes
import kotlin.time.seconds

@ExperimentalTime
suspend fun main() {
    var timerCountdown = 1.minutes + 20.seconds
    val interval = 1.seconds
    while (timerCountdown != Duration.ZERO) {
        println(timerCountdown.toMinutesAndSeconds())
        delay(interval)
        timerCountdown -= interval
    }
}

@ExperimentalTime
fun Duration.toMinutesAndSeconds(): String = toComponents { minutes, seconds, _ ->
    val minutesFormatted = "%02d".format(minutes)
    val secondsFormatted = "%02d".format(seconds)
    "$minutesFormatted:$secondsFormatted"
}

@ExperimentalTime
suspend fun delay(duration: Duration) = delay(duration.toLongMilliseconds())