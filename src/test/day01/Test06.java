package test.day01;

public class Test06 {
    public static void main(String[] args) {
   /*     S s = new S();*/
         Fu s = new S();
        System.out.println(s.c);
        s.get();

/*
        System.out.println(S.factor);*/
        System.out.println(Zu.factor);
    }
}
class Zu{
    public static int factor = 85;
    static {
        System.out.println("yy在静态代码块"+factor);
    }
  public int c=2;
    public Zu() {
        System.out.println("我是yyy~");
    }
    public void get(){
        System.out.println("z");
        System.out.println("c"+c);
    }
}
class Fu extends Zu{
    public static int factor = 25;
    static {
        System.out.println("bb在静态代码块"+factor);
    }

    public int c=1;
    public Fu() {
        System.out.println("我是爸爸~");
    }
    public void get(){
        System.out.println("f");
        System.out.println("c"+c);
    }

}
class S extends Fu{
    static {
        System.out.println("儿子在静态代码块");
    }
    public int c=0;
    public static int factor = 2;
    public S() {
        System.out.println("我是儿子~");
    }
   /* public void get(){
        System.out.println("s");
        System.out.println("c"+c);
    }*/
}




