//question from Kotlin telegram, cannot found any inconsistencies

val order_id = 123L
val regPayNum = 56
val event = "create"

val tickets = listOf("ticket2", "ticket2", "ticket2")

class Ticket

fun String.toTicket(orderId: Long, regPayNum: Int, event: String): Ticket = error("Can't do that")

fun toTickets(): List<Ticket> = tickets.map { it.toTicket(order_id, regPayNum, event) }

fun toTicketsAlt(): List<Ticket> {
    return tickets.map { it.toTicket(order_id, regPayNum, event) }
}

fun main() {
    println(runCatching { toTickets() })
    println(runCatching { toTicketsAlt() })
}

