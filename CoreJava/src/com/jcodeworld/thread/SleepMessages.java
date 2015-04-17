package com.jcodeworld.thread;

public class SleepMessages {
	public static void main(String args[])
	        throws InterruptedException {
	        String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };

	        for (int i = 0;i < importantInfo.length;i++) {
	            //Pause for 4 seconds
	            Thread.sleep(4000); // TThis is causing the Main thread to sleep for at-least 4 seconds
	            //Print a message
	            System.out.println(importantInfo[i]);
	        }
	    }
}
