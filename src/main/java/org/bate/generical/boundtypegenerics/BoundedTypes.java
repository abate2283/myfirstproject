package org.bate.generical.boundtypegenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedTypes <T, U> {

    public <T extends String> void getSomeGeneric(List<T> tList){

    }

    public static <T extends Number> void showRespect(List<T> staticList){

    }

    public static<T extends String> String detailer(List<T> list){
        System.out.println("Answer: ");
        return "more details coming";
    }

    public static <T extends String> String someNumbers(List<T> numberList, int result){
        System.out.println(numberList + " " +result);
        return "result is: ";
    }

    public static void main(String[] args) {
        List<String> listing = Arrays.asList("Alfred", "Mercy", "Angel", "Zion");

        someNumbers(listing, 22);
        BoundedTypes<String, String> stringBoundedTypes = new BoundedTypes<>();


    }
}
