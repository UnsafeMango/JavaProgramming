package com.company;

import static com.company.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start(); //start the other thread

        new Thread() { //anonymous class
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");


    }
}
