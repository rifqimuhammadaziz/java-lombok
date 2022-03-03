package rifqimuhammadaziz.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    void testNullConstructor() {
        // when parameter is null, it will throw exception
        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member(null, null);
        });
    }

    @Test
    void testNullSetter() {
        // when parameter is null, it will throw exception
        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member("xenosty", "xenosty");
            member.setName(null);
        });
    }

    @Test
    void testNullMethod() {
        // when parameter is null, it will throw exception
        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new Member("xenosty", "xenosty");
            member.sayHello(null);
        });
    }
}
