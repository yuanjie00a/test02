package test.day01;/*
package test.day01;
public class Book {
        Book() {
            System.out.println("��Ĺ��췽��");
            System.out.println("price=" + price + ",amount=" + amount);
        }

        {
            System.out.println("�����ͨ�����");*/
/**//*

        }

        int price = 110;

        static {
            System.out.println("��ľ�̬�����");
        }

        static int amount = 112;
    }

    class Grandpa {
        static {
            System.out.println("үү�ھ�̬�����");
        }
    }

    public class Father extends Grandpa {
        static {
            System.out.println("�ְ��ھ�̬�����");
        }
        public static int factor = 25;

        public Father() {
            System.out.println("���ǰְ�~");
        }
    }

    class Son extends Father {
        static {
            System.out.println("�����ھ�̬�����");
        }

        public Son() {
            System.out.println("���Ƕ���~");
        }
    }

 class InitializationDemo
{
    public static void main(String[] args)
    {
        System.out.println("�ְֵ�����:" + Son.factor);  //���
    }
}

*/
