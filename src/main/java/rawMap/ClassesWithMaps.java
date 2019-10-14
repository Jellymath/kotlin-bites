package rawMap;

public class ClassesWithMaps {
    public static final KGenericClassWithMap kRaw = new KGenericClassWithMap();
    public static final JGenericClassWithMap jRaw = new JGenericClassWithMap();

    public static final KGenericClassWithMap<?> kWildCard = new KGenericClassWithMap<>();
    public static final JGenericClassWithMap<?> jWildCard = new JGenericClassWithMap<>();
}
