package rifqimuhammadaziz.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {
        Customer customer = new Customer();
        customer.setId("0001");
        customer.setName("Xenosty");

        System.out.println(customer.getId());
        System.out.println(customer.getName());
    }

    @Test
    void testCustomerConstructor() {
        Customer customer = new Customer("0001", "Xenosty");
        Assertions.assertEquals("0001", customer.getId());
        Assertions.assertEquals("Xenosty", customer.getName());
    }

    @Test
    void testEquals() {
        // only compare 'id' (exclude 'name')
        Customer customer1 = new Customer("0001", "Xenosty 1");
        Customer customer2 = new Customer("0001", "Xenosty 2");

        Assertions.assertEquals(customer1, customer2);
        Assertions.assertEquals(customer1.hashCode(), customer2.hashCode());
    }
}
