package TP2_1_java.ex2;

public class main {
    public static void main(String[] args) {
        AndroidThread androidThread =new AndroidThread();
        PythonThread pythonThread = new PythonThread();
        pythonThread.setName("Python Thread");
        androidThread.setName("Android Thread");
        androidThread.start();
        pythonThread.start();
    }
}
