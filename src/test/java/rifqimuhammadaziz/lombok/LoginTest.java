package rifqimuhammadaziz.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testCreate() {
        Login login1 = Login.createEmpty();
        Assertions.assertNull(login1.getUsername());
        Assertions.assertNull(login1.getPassword());

        Login login2 = Login.create("xenosty", "secretpassword");
        Assertions.assertEquals("xenosty", login2.getUsername());
        Assertions.assertEquals("secretpassword", login2.getPassword());
    }
}
