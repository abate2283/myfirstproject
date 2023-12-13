package org.bate;



public class Table {
    String color;
    int legs;
    int height;
    double money;


    public static void main(String[] args) {
        Table table = new Table();
        table.color = "white table with ";
        table.height = 34;
        table.money = 23.03;
        table.legs = 4;
//        System.out.println("with");
//        System.out.println(table.color +" "+ "with "+ table.legs);

        System.out.println(table.color+ " " + table.legs + " legs");

    }
}
