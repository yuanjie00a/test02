package test.day03;

public class RunableDemo01 {
    public static void main(String[] args) {
        Runnable a= new Runnable() {
            @Override
            public void run() {

            while (RunableDemo01.tikect>0){
                synchronized (RunableDemo01.class){
                    if (RunableDemo01.tikect<=0){
                        return;
                    }
                    System.out.println(Thread.currentThread().getName()+"Ê£ÓàÆ±Îª"+--RunableDemo01.tikect);
                }
            }
            }
        };
        Thread thread1 = new Thread(a);
        Thread thread2= new Thread(a);
        Thread thread3= new Thread(a);
        Thread thread4= new Thread(a);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
    private static int tikect=100;
}
