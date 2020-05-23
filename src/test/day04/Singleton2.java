package test.day04;
/* 懒汉，线程安全，但线程阻塞，性能不好*/
public class Singleton2 {
    private static Singleton2 singleton;
    private Singleton2(){
//Shello
    }
    public static synchronized Singleton2 getSingleton(){
        if (singleton==null){
            singleton=new Singleton2();
        }
        return singleton;
    }
}
