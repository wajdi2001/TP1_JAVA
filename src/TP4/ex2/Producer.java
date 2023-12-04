package TP4.ex2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
//action
//notify
//while(conditon)
//wait
public class Producer extends  Thread{
          final int MAX_SIZE=5;
          List<Character> message;

          public Producer(List<Character> message){

              this.message=message;

          }
          synchronized void  produce()
        {

                message.add('x');
            System.out.println(message);

            notify();
            while(message.size() == MAX_SIZE) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        @Override
        public void run() {
            while (true)
             produce();
        }
}
