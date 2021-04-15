package com.leetcode._1114;

import java.util.concurrent.Semaphore;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/4 14:44
 * @Description ：
 */
public class Foo {

    private Semaphore two = new Semaphore(0);
    private Semaphore three = new Semaphore(0);
    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        two.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        two.acquire(); //reducing the number of available permits by one.
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        three.release();  //Releases a permit, increasing the number of available permits by one.
    }

    public void third(Runnable printThird) throws InterruptedException {
        three.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
