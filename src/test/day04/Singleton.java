package test.day04;
/* 懒汉，线程不安全*/
public class Singleton {
    private static Singleton singleton;
    private Singleton(){

    }
    public static Singleton getSingleton(){
        if (singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
