package rifqimuhammadaziz.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest {

    @Test
    void testWith() {
        Register register1 = new Register("xenosty", "secret");
        Register register2 = register1.withUsername("rifqi");

        // register1 & register2 password must be equals
        Assertions.assertEquals(register1.getPassword(), register2.getPassword());

        // register1 & register2 username must be not equals
        Assertions.assertNotEquals(register1.getUsername(), register2.getUsername());
    }
}
