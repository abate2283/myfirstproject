package org.bate.inheritanceexamples;

public class TestStaffContact {
    public static void main(String[] args) {
        Staffs staffs = new Staffs();
        staffs.setCustomerId(29076);
        staffs.setAddress(new Address("1213 N.Aster Ave. Broken Arrow", "OK 74012", "USA"));
        staffs.setName("Angel Bate");
        staffs.setEmail("angel@gmail.home");
        staffs.setPhone("212-456-7865");
        staffs.display(new Address());
    }
}
