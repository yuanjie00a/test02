package test.day04;
/* �������̰߳�ȫ�����߳����������ܲ���*/
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
