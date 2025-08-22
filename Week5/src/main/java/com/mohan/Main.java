package com.mohan;
/*
* MultiThreading in Java:
*
* Enables a programs to run multiple threads concurrently.
* What is thread?
*   - As set of instructions that run independably.
* Useful for backgroud tasks.

* */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    MyRunnable myRunnable = new MyRunnable;
    Thread thread = new Thread ((Runnable) myRunnable);
    thread.start();


    }
}