package TP2_1_java.ex1;

public class main {
    public static void main(String[] args) {
        AndroidThread androidThread =new AndroidThread();
        PythonThread pythonThread = new PythonThread();
        androidThread.start();
        pythonThread.start();
    }
}
