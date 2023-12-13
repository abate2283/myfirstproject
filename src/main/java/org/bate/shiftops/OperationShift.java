package org.bate.shiftops;

public class OperationShift {
    public static final OperationShift single = new OperationShift();
    private OperationShift(){
    }

    public static OperationShift getSingleton(){
        return single;
    }
    public static void main(String[] args) {
        OperationShift singleton = OperationShift.getSingleton();
        OperationShift sing = OperationShift.getSingleton();
        int a=2;
        int b = 3;
        a = a+10;
        a += 100;
        System.out.println(a+=100);
        System.out.println("left shift op :" + (20<<2));
        System.out.println("right shift op :" + (20>>2));
        System.out.println(20 > 5 && 3 < 7);
        System.out.println(120 > 15 || 34 > 7 || 0.7<1.5);
    }
}
