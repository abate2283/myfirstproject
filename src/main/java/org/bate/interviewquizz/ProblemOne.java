package org.bate.interviewquizz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProblemOne {
    /**
     * Given a string containing digits from 2-9 inclusive,
     * return all possible letter combinations that the number
     * could represent. Return the answer in any order.
     * A mapping of digits to letters (just like on the
     * telephone buttons) is given below. Note that 1 does not map to any letters.
     */

    public static String getOutput(String [] s){

        for(int i =0; i<9; i++){
            if(s ==null){
                System.out.println(s[i]);
                return s.toString();
            }
        }
        return "output";

    }

    public static void main(String[] args) {
        Map<String, String> mapList = new HashMap<>();
        mapList.put("2", "abc");
        mapList.put("3", "def");
        mapList.put("4", "ghi");
        mapList.put("5", "jkl");
        String output [] = {"abc", "def", "ghi"};
        StringBuilder stringBuilder = new StringBuilder(Arrays.toString(output));
        for(int i = 0; i < mapList.size(); i++){
            if(mapList.get(i).equals("2")){

        System.out.println(mapList.get(i));
            }
        }

    }
}
