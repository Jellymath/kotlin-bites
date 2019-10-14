package rawMap;

import java.util.Map;

public class JGenericClassWithMap<T> {
    public final Map<String, Integer> directAccessMap = Map.of("Hello", 1, "World", 2);
    private final Map<String, Integer> mapForGetter = Map.of("Hello", 1, "World", 2);

    public Map<String, Integer> getMapForGetter() {
        return mapForGetter;
    }
}
