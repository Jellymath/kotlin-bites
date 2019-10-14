package strangeWrapper;

import java.util.Set;

public class StrangeWrapperTest {
    public static void main(String[] args) {
        var wrap = CollectionWrap.wrap(Set.of(1, 2, 3));
        System.out.println(wrap);
    }
}
