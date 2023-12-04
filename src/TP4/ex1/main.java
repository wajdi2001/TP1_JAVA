package TP4.ex1;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Character> message=new ArrayList<>();
        Thread t1 =new SpellingThreads(message,"Hello");
        Thread t2 =new SpellingThreads(message,"World");
        t1.start();
        t2.start();
    }
}
