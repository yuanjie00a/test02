package test.day04;
/*¾²Ì¬ÄÚ²¿Àà*/
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
