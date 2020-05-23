package test.day01.Test2;

public class Fu {
Fu(int a){
        System.out.println("父类的构造函数"+a);
        look();
    }
Fu(){
      System.out.println("父类的构造函数");
      look();
  }
    void look(){
        System.out.println("父类的方法");
    }
    {
        System.out.println("父类的代码块");
    }
}
class Zi extends Fu{
    Zi(){
        super(3);
        System.out.println("子类的构造函数");
        look();
    }
    {
        System.out.println("子类的代码块");
    }
    Zi(int x){
        /*super(22);*/
        System.out.println("子类的构造带参函数"+x);
    }
     void look(){
        System.out.println("子类的方法");
    }
}
