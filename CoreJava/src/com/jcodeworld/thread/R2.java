package com.jcodeworld.thread;

class R1 implements Runnable{	
	public void run() {
	 System.out.println(Thread.currentThread().getName());	
	}	
}

public class R2 implements Runnable {
	public void run() {
        new Thread(new R1(), "|R1a|").run();
        new Thread(new R1(), "|R1b|").start();
		System.out.println(Thread.currentThread().getName());	
	}
	
public static void main(String[] args) {
	new Thread(new R2(), "|R2|").start();	
 }
}
