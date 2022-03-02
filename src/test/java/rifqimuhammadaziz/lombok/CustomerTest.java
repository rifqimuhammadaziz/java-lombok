package rifqimuhammadaziz.lombok;

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
}
