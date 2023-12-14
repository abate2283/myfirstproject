package org.bate.string;

public class StringLecture {
    public static void main(String[] args) {
        String s1 = "Alfred A Bate";
        char ch[] = {'A', 'l', 'f'};
        String s2 = new String("Mercy");
        String s3 = "abc";
        System.out.println(s3);
        s3.concat("xyz");
        String s4 = s3.concat("xyz");
        System.out.println(s2+ "\n" + s4 + "\n" +s2);
    }

}
