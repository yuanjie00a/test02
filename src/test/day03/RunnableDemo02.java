package test.day03;

public class RunnableDemo02 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("run");
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
class start{
    public static void main(String[] args) throws InterruptedException {
        RunnableDemo02 runnableDemo02 = new RunnableDemo02();
        runnableDemo02.start();
        runnableDemo02.interrupt();
        System.out.println("main");
    }
}
