package test.day01;

public class Test04 {
    static
    {
        System.out.println("爷爷在静态代码块");
    }
    public static int factor = 25;
}
class Father extends Test04
{
    static
    {
        System.out.println("爸爸在静态代码块");
    }

  //  public static int factor = 25;

    public Father()
    {
        System.out.println("我是爸爸~");
    }
}
class Son extends Father
{
    static
    {
        System.out.println("儿子在静态代码块");
    }

    public Son()
    {
        System.out.println("我是儿子~");
    }
}
class Test{

    public static void main(String[] args)
    {
        System.out.println("爸爸的岁数:" + Son.factor);  //入口
    }
}
/*
* class Grandpa
{
    static
    {
        System.out.println("爷爷在静态代码块"); 1
    }

    public Grandpa() {
        System.out.println("我是爷爷~");
    }
}
class Father extends Grandpa
{
    static
    {
        System.out.println("爸爸在静态代码块");2
    }

    public Father()
    {
        System.out.println("我是爸爸~");
    }
}
class Son extends Father
{
    static
    {
        System.out.println("儿子在静态代码块");3
    }

    public Son()
    {
        System.out.println("我是儿子~");
    }
}
public class InitializationDemo
{
    public static void main(String[] args)
    {
        new Son();  //入口
    }
}*/

/*public class Book {
    public static void main(String[] args)
    {
        staticFunction();
    }

    static Book book = new Book();

    static
    {
        System.out.println("书的静态代码块");
    }

    {
        System.out.println("书的普通代码块");
    }
    Book()
    {
        System.out.println("书的构造方法");
        System.out.println("price=" + price +",amount=" + amount);
    }

    public static void staticFunction(){
        System.out.println("书的静态方法");
    }

    int price = 110;
    static int amount = 112;
}
* */
/*书的静态代码块
*书的普通代码块
*书的构造方法
*price=" + price +",amount=" + amount  ,   ; 12
*书的静态方法
*
* */