package org.bate;

public class Student {
    private int id;
    private String location;
    private String name;

    public void display(){
        System.out.println(id + " " + name +" " + location);
    }

    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();


        s.id = 101;
        s.location = "Broken Arrow";
        s.name = "Alfred Bate";
        s.display();

        s.location = "Tulsa";
        s.name = "Zachary Martin";
        s.location = "Paris";
        s.id = 301;
        s.display();

        s.location = "London";
        s.name = "Hilary New York";
        s.id = 201;
        s.display();


    }
}
