package org.bate;

public class Person {
    String name;
    String location;
    String country;

    public Person(String name, String location, String country){
        this.name = name;
        this.location = location;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Person(){}

    public static void main(String[] args) {
        Person woman = new Person("Hannah Bate ", "Lives in Buea, S.W.P,", "Cameroon");
        System.out.println(woman.name + " " + woman.location + " " + woman.country);
        woman.setName("Ma Frida Efange");
        woman.setLocation("Lives in Buea-Town, South West Province.");
        woman.setCountry("Cameroon - Africa");
        woman.setCountry(woman.getCountry());
        System.out.println(woman.getName() + " " + woman.getLocation() + " " + woman.getCountry());
    }
}
