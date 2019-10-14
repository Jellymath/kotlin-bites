data class Location(val id: String, val name: String)

fun test(locations: List<Location>): Map<String, String> = locations.associate { it.id to it.name }