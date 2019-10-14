package rawMap

fun main() {
    val jRawGetterMap = ClassesWithMaps.jRaw.mapForGetter
    val jRawDirectMap = ClassesWithMaps.jRaw.directAccessMap
    val kRawMap = ClassesWithMaps.kRaw.map
    val kRawGetterMap = ClassesWithMaps.kRaw.explicitGetter()

    val jWildCardGetterMap = ClassesWithMaps.jWildCard.mapForGetter
    val jWildCardDirectMap = ClassesWithMaps.jWildCard.directAccessMap
    val kWildCardMap = ClassesWithMaps.kWildCard.map
}