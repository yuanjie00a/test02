package test.day02;

public class Test02 {
    public static void main(String[] args) {
        short a=1;
       /* a=a+1;*/
       Integer x=new Integer(1);
       Integer y=new Integer(1);
        System.out.println(x==y);
        System.out.println(x.equals(y));
        String abc = new String("abc");
        String abc1 = new String("abc");
        System.out.println(abc==abc1);
        System.out.println(abc.equals(abc1));
        String abc2="abc";
        System.out.println(abc==abc2);
        System.out.println(abc.equals(abc2));
    }
}
