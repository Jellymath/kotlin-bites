package rawMap;

public class JMapUsageTest {
    public static void main(String[] args) {
        var jRawGetterMap = ClassesWithMaps.jRaw.getMapForGetter();
        var jRawDirectMap = ClassesWithMaps.jRaw.directAccessMap;
        var kRawMap = ClassesWithMaps.kRaw.getMap();
        var kRawGetterMap = ClassesWithMaps.kRaw.explicitGetter();

        var jWildCardGetterMap = ClassesWithMaps.jWildCard.getMapForGetter();
        var jWildCardDirectMap = ClassesWithMaps.jWildCard.directAccessMap;
        var kWildCardMap = ClassesWithMaps.kWildCard.getMap();
        var kWildCardGetterMap = ClassesWithMaps.kWildCard.explicitGetter();
    }
}
