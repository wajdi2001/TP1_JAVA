package TP2_1_java.ex2;

import java.io.FileWriter;
import java.io.IOException;

public class PythonThread extends Thread{


    @Override
    public void run() {

        try {
            long s = System.currentTimeMillis();
            try (
                    FileWriter fw = new FileWriter("C:/Users/tenzo/Documents/test2.txt", true)) {

                for(int i=0;i<100000;i++)
                {

                    fw.write("\tI love Python\n");
                    fw.flush();
                }
            }
            long e = System.currentTimeMillis();
            System.out.println(getName() + " " + (e - s));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
