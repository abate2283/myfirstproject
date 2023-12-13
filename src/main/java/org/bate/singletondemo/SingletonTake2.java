package org.bate.singletondemo;

public class SingletonTake2 {
    public static  SingletonTake2 singleton;

    private SingletonTake2(){
        System.out.println("new instance created...");
    }

    public static SingletonTake2 getInstance(){
        if(singleton==null){
            synchronized (SingletonTake2.class){
            if(singleton == null){
                singleton = new SingletonTake2();
            }
            }

        }
        return singleton;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            SingletonTake2 singletonTake2 = SingletonTake2.getInstance();
        });
        Thread t2 = new Thread(()->{
            SingletonTake2 singletonTake = SingletonTake2.getInstance();
        });
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

    }
}
