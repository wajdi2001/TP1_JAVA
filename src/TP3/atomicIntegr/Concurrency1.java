package TP3.atomicIntegr;

public class Concurrency1  implements  Runnable{

    @Override
    public void run() {
        for(int i=0;i<100000;i++)
           Main.count.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Concurrency1 concurrency1 = new Concurrency1();
        Thread th1 =new Thread(concurrency1);
        Thread th2 =new Thread(concurrency1);

        th1.start();
        th2.start();
        th1.join();
        th2.join();

        System.out.println(Main.count);
    }
}
