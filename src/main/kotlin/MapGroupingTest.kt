// https://t.me/kotlin_start/3709

class TaxiPark(val trips: List<Trip>, val description: String)

class Trip(val passengers: List<Passenger>, val description: String)

data class Passenger(val name: String)

fun TaxiPark.findFaithfulPassengers(minTrips: Int): Set<Passenger> {
    return trips.flatMap { it.passengers }
        .groupingBy { it }.eachCount()
        .filterValues { it >= minTrips }.keys
}