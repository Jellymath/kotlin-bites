import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.ZonedDateTime

fun main() {
    val localDateTime = LocalDateTime.now()
    val zonedDateTime = ZonedDateTime.now()
    localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli()
    zonedDateTime.toInstant().toEpochMilli()

    localDateTime.millis(ZoneOffset.UTC)
    zonedDateTime.millis
}

fun LocalDateTime.millis(zoneOffset: ZoneOffset) = toInstant(zoneOffset).toEpochMilli()
val ZonedDateTime.millis get() = toInstant().toEpochMilli()