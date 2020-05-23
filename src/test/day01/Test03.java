package test.day01;/*
package test.day01;
public class Book {
        Book() {
            System.out.println("书的构造方法");
            System.out.println("price=" + price + ",amount=" + amount);
        }

        {
            System.out.println("书的普通代码块");*/
/**//*

        }

        int price = 110;

        static {
            System.out.println("书的静态代码块");
        }

        static int amount = 112;
    }

    class Grandpa {
        static {
            System.out.println("爷爷在静态代码块");
        }
    }

    public class Father extends Grandpa {
        static {
            System.out.println("爸爸在静态代码块");
        }
        public static int factor = 25;

        public Father() {
            System.out.println("我是爸爸~");
        }
    }

    class Son extends Father {
        static {
            System.out.println("儿子在静态代码块");
        }

        public Son() {
            System.out.println("我是儿子~");
        }
    }

 class InitializationDemo
{
    public static void main(String[] args)
    {
        System.out.println("爸爸的岁数:" + Son.factor);  //入口
    }
}

*/
