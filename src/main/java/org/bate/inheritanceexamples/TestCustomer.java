package org.bate.inheritanceexamples;

public class TestCustomer {
    public static void main(String[] args) {
        Customer client = new Customer();
        client.setCustomerId(29076);
        client.setAddress(new Address("1213 N.Aster Ave. Broken Arrow", "OK 74012", "USA" ));
        client.setName("Angel Bate");
        client.setEmail("angel@gmail.home");
        client.setPhone("212-456-7865");
        client.display();

    }
}
