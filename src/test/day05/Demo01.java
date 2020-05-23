package test.day05;

public class Demo01 {
    public int i = 100;

    public static void main(String[] args) {
        new Demo01().start();
    }

    public void start() {
        CountDownThread thread1 = new CountDownThread();
        CountDownThread thread2 = new CountDownThread();
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("i=" + i);
    }


    class CountDownThread extends Thread {
        @Override
        public void run() {
            super.run();
            while (i > 0) {
                i--;
            }
        }
    }
}
