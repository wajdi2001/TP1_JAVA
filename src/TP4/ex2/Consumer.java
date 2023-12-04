package TP4.ex2;

import java.util.ArrayList;
import java.util.List;

public class Consumer extends Thread{

    List<Character> message ;

    public Consumer(List<Character> message){

        this.message=message;

    }
    synchronized void  consume()
    {
        message.remove(0);
        System.out.println("consume");

        notify();
        while(message.isEmpty()) {
            try {

                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Override
    public void run() {
        while (!message.isEmpty())
         consume();
    }
}
