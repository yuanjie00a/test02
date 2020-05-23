package test.day04;
/* 饿汉，线程安全，但占用内存*/
public class Singleton1 {
    private static Singleton1 singleton =new Singleton1();
    private Singleton1(){

    }
    public static Singleton1 getSingleton(){
        return singleton;
    }
}
