package test.day01;

public class Test04 {
    static
    {
        System.out.println("үү�ھ�̬�����");
    }
    public static int factor = 25;
}
class Father extends Test04
{
    static
    {
        System.out.println("�ְ��ھ�̬�����");
    }

  //  public static int factor = 25;

    public Father()
    {
        System.out.println("���ǰְ�~");
    }
}
class Son extends Father
{
    static
    {
        System.out.println("�����ھ�̬�����");
    }

    public Son()
    {
        System.out.println("���Ƕ���~");
    }
}
class Test{

    public static void main(String[] args)
    {
        System.out.println("�ְֵ�����:" + Son.factor);  //���
    }
}
/*
* class Grandpa
{
    static
    {
        System.out.println("үү�ھ�̬�����"); 1
    }

    public Grandpa() {
        System.out.println("����үү~");
    }
}
class Father extends Grandpa
{
    static
    {
        System.out.println("�ְ��ھ�̬�����");2
    }

    public Father()
    {
        System.out.println("���ǰְ�~");
    }
}
class Son extends Father
{
    static
    {
        System.out.println("�����ھ�̬�����");3
    }

    public Son()
    {
        System.out.println("���Ƕ���~");
    }
}
public class InitializationDemo
{
    public static void main(String[] args)
    {
        new Son();  //���
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
        System.out.println("��ľ�̬�����");
    }

    {
        System.out.println("�����ͨ�����");
    }
    Book()
    {
        System.out.println("��Ĺ��췽��");
        System.out.println("price=" + price +",amount=" + amount);
    }

    public static void staticFunction(){
        System.out.println("��ľ�̬����");
    }

    int price = 110;
    static int amount = 112;
}
* */
/*��ľ�̬�����
*�����ͨ�����
*��Ĺ��췽��
*price=" + price +",amount=" + amount  ,   ; 12
*��ľ�̬����
*
* */