package TP4.ex1_1;

import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SpellingThreads extends  Thread{
    static Semaphore verrou =new Semaphore(1);
    List<Character> message ;
    String chaine;
    public  SpellingThreads(List<Character>message,String chaine)
    {
        this.chaine=chaine;
        this.message=message;

    }


    @Override
    public void run() {
        super.run();
        try {
            verrou.acquire();
            for(int i=0;i<chaine.length();i++)
            {
                message.add(chaine.charAt(i));
            }
            System.out.println(message);
            verrou.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
}
