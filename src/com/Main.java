package com;

import javafx.scene.layout.Priority;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        System.out.println("thread Main");


    }
}

class MyThread extends Thread {
    @Override
    public void run() {

        for (int i = 1; i < 51; i++) {
            try {
                System.out.println("Thread 0 runs "+i+" times ");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}