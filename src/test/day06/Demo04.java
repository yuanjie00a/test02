package test.day06;
/*两个线程 交替打印1-100*/
public class Demo04 {
    private static final Object lock = new Object();  //表示对象锁
    private int index = 100;//表示要输出的数字
    private  boolean aHasPrint = false;      //记录1是否被打印过
    public static void main(String[] args) {
        Demo04 solution2 = new Demo04();
        Thread threadA = new Thread(solution2.new A());
        Thread threadB = new Thread(solution2.new B());
        threadA.start();
        threadB.start();
    }
    class A implements Runnable {
        @Override
        public void run() {
            while (index>1) {
                synchronized (lock) {
                    while (aHasPrint) {//如果2已经打印过就进行阻塞
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"线程二输出" + index);
                    index--;
                    aHasPrint = true;//表示2已经打印过
                    lock.notifyAll();//唤醒其它线程执行
                }
            }
        }
    }

    class B implements Runnable {
        @Override
        public void run() {
            while (index>1) {
                synchronized (lock) {
                    while (!aHasPrint) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"线程一输出"+ index);//输出B的值
                    index--;
                    aHasPrint = false;//一打印完了说明新的一轮开始了，将标识为计为2没有打印过
                    lock.notifyAll();//唤醒阻塞线程
                }
            }
        }
    }
}