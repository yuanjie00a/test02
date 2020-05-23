package test.day01;

import java.util.Objects;

public class Book {
    public static void main(String[] args)
    {
        /*staticFunction();*/

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
    class AA{
    public static void main(String[] args) {
        Book book = new Book();
        Book books = new Book();
        System.out.println(book==books);
        System.out.println(book.equals(books));
        System.out.println(books);
        System.out.println(book);

    }
}