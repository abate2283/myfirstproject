package org.bate.inheritanceexamples;

public class Staffs {
    int customerId;
    String name;
    String phone;
    String email;
    Address address;

    public Staffs() {
    }
    public Staffs(int customerId, String name, String phone, String email) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.email = email;

    }

    public void display(Address address){
        System.out.println("******Customer Details******");
        System.out.println("Identification:" + customerId + "\n"+"Name:"+name +"\n" +"Phone:" +phone +"\n" + "Email: "+email);
        System.out.println("******Customer Address Details******");
        System.out.println(address.getLocation()+" "+address.getState() + " " +address.getCountry());

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
