package test.day06;
/*�����߳� �����ӡ1-100*/
public class Demo04 {
    private static final Object lock = new Object();  //��ʾ������
    private int index = 100;//��ʾҪ���������
    private  boolean aHasPrint = false;      //��¼1�Ƿ񱻴�ӡ��
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
                    while (aHasPrint) {//���2�Ѿ���ӡ���ͽ�������
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"�̶߳����" + index);
                    index--;
                    aHasPrint = true;//��ʾ2�Ѿ���ӡ��
                    lock.notifyAll();//���������߳�ִ��
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
                    System.out.println(Thread.currentThread().getName()+"�߳�һ���"+ index);//���B��ֵ
                    index--;
                    aHasPrint = false;//һ��ӡ����˵���µ�һ�ֿ�ʼ�ˣ�����ʶΪ��Ϊ2û�д�ӡ��
                    lock.notifyAll();//���������߳�
                }
            }
        }
    }
}