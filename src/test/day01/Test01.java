package test.day01;

public class Test01 {
    public static void main(String[] args) {
   /*     A a;
        a=new A();
        System.out.println("------------------");
        a=new A();
        System.out.println("-------------------");
        A  aa=new A();*/
   /*     B c = new B();*/
      /*  int a = B.a;
        System.out.println(a);*/
        C c = new C();
    }

}
class A{
    public static void main(String[] args) {

    }
    {
        System.out.println("A�Ĺ�������");
    }
    public  static  int a=100;
 /*  private static C c=new C();*/
    public A() {
        System.out.println("A���캯��");
    }
    static {
        System.out.println("A�ľ�̬�����");
    }
    private static C c=new C();
}
class C extends A{
    public static void main(String[] args) {
        C c = new C();
        /*\.jar;D:\javarun\Java\jdk1.8.0_211\jre\lib\ext\jfxrt.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\ext\localedata.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\ext\nashorn.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\ext\sunec.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\ext\sunjce_provider.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\ext\sunmscapi.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\ext\sunpkcs11.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\ext\zipfs.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\javaws.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\jce.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\jfr.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\jfxswt.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\jsse.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\management-agent.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\plugin.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\resources.jar;D:\javaruanjian\Java\jdk1.8.0_211\jre\lib\rt.jar;D:\IdeaProjects02\Test\out\production\Test test.day01.C
A�ľ�̬����
C��̬�����
A�Ĺ�������
A���캯��
C�Ĺ�������
C�Ĺ��캯��*/
    }
    public C() {
        System.out.println("C�Ĺ��캯��");//3
    }
    static {
        System.out.println("C��̬�����");//1
    }
    {
        System.out.println("C�Ĺ�������");//2
    }
}
class B extends A{
    public B() {
        System.out.println("B�Ĺ��캯��");//9 13
    }
    static {
        System.out.println("B��̬�����");//5
    }
    {
        System.out.println("B�Ĺ�������");//8 12
    }
  public void t(int a){
      System.out.println(a);
  }

}
class D{
    public D() {
        System.out.println("D�Ĺ��캯��");//3
    }
    static {
        System.out.println("D��̬�����");//1
    }
    {
        System.out.println("D�Ĺ�������");//2
    }
}
class E{
    public static void main(String[] args) {
        B book = new B();/*
     C��̬�����
A�Ĺ�������
A���캯��
C�Ĺ�������
C�Ĺ��캯��
A�ľ�̬�����
B��̬�����
A�Ĺ�������
A���캯��
B�Ĺ�������
B�Ĺ��캯��
        */
    }
}
 class ClassLoadTest {
   private static ClassLoadTest test = new ClassLoadTest();

   static int x;
    static int y = 0;

   public ClassLoadTest() {
      x++;
      y++;
   }
   public static void main(String[] args) {
       System.out.println(test.x);//  1,1
       System.out.println(test.y);
   }
}
class FR{
    public static void main(String[] args) {
    /*    B[] bs = new B[3];
        bs[1].t(3);*/
       /* C c = new C();*/
     /*   System.out.println("aaa");*/
      /*  A a = new A();*/
        /*System.out.println(C.a);*/
        /*
        * A�Ĺ�������
        A���캯��
        C�Ĺ�������
        C�Ĺ��캯��
        A�ľ�̬�����
        C��̬�����
        A�Ĺ�������
        A���캯��
        C�Ĺ�������
        C�Ĺ��캯��

        * */
        A a = new A();/*C��̬�����
A�Ĺ�������
A���캯��
C�Ĺ�������
C�Ĺ��캯��
A�ľ�̬�����
A�Ĺ�������
A���캯��*/
        System.out.println("aaa");
    }
        }

