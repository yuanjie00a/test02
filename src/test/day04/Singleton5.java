package test.day04;
/*��̬�ڲ���*/
public class Singleton5 {
    private Singleton5(){
    }
    private static class SingletonH{
        private static final Singleton5 singleton=new Singleton5();
    }
    public static Singleton5 getSingleton(){
        return SingletonH.singleton;
    }

}
