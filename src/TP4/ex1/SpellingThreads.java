package TP4.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SpellingThreads extends  Thread{
    static Lock verrou =new ReentrantLock();
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
        verrou.lock();

        for(int i=0;i<chaine.length();i++)
        {
            message.add(chaine.charAt(i));
        }
        System.out.println(message);
        verrou.unlock();


    }
}
