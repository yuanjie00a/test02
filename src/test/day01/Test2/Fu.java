package test.day01.Test2;

public class Fu {
Fu(int a){
        System.out.println("����Ĺ��캯��"+a);
        look();
    }
Fu(){
      System.out.println("����Ĺ��캯��");
      look();
  }
    void look(){
        System.out.println("����ķ���");
    }
    {
        System.out.println("����Ĵ����");
    }
}
class Zi extends Fu{
    Zi(){
        super(3);
        System.out.println("����Ĺ��캯��");
        look();
    }
    {
        System.out.println("����Ĵ����");
    }
    Zi(int x){
        /*super(22);*/
        System.out.println("����Ĺ�����κ���"+x);
    }
     void look(){
        System.out.println("����ķ���");
    }
}
