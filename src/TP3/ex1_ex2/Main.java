package TP3.ex1_ex2;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public  static  int count;
   static  synchronized void increment()
    {
        count++;
    }
}
