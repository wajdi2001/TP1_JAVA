package TP3.ex4;

public class ThreadExample extends  Thread {
 volatile boolean finish =true;

 boolean isFinish(){
     return  finish= false;
 }
    @Override
    public void run() {

        while (finish ==true)
            System.out.println("en cours d'exec");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample th1 =new ThreadExample();
        th1.start();
        th1.sleep(100);
        th1.isFinish();
    }
}
