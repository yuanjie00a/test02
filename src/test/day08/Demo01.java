package test.day08;

/**
 * @ProjectName: Test03
 * @Author: YuanJie
 * @CreateDate: 2020-06-07 12:12
 * @Description: 类说明
 */
public class Demo01 {
    private  static  boolean s = false;//判断
    private static  final String a = "aaa";
    private static int i = 100;

    public static void main(String[] args) {
        Thread thread = new Thread(new T1());
        Thread thread2 = new Thread(new T2());
        thread.start();
        thread2.start();
    }
    static class T1 implements Runnable {
        @Override
        public void run() {
            while (i > 1) {
                synchronized (a) {
                    while (i%2==0) {
                        try {
                            a.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "打印" + i);
                    i--;
                    //s = true;
                    a.notifyAll();
                }
            }


        }
    }
       static   class T2 implements Runnable {
            @Override
            public void run() {
                while (i > 1) {
                    synchronized (a) {
                        while (i%2==1) {
                            try {
                                a.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                        System.out.println(Thread.currentThread().getName() + "打印了" + i);
                        i--;

                        //s = false;
                        a.notifyAll();
                    }
                }

            }
        }
    }

