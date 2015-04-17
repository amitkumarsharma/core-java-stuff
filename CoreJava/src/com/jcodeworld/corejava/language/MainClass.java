/*
 * This class is the main Class to execute the program for test
 * 
 */
package com.jcodeworld.corejava.language;
import static java.lang.System.out;
import java.util.ArrayList;
public class MainClass {
	public static void main(String[] args) { 		
	int something = 2;
	long startTime = System.currentTimeMillis();
	for (int i=Integer.MAX_VALUE-1; i>=0; i--) {
		 something = -something;
	}
	long midTime = System.currentTimeMillis();
	
	for (int i=0, n=Integer.MAX_VALUE; i<n; i++) {
	  something = -something;
	}
	long endTime = System.currentTimeMillis();
	out.println("Sart Time: " + startTime);
	out.println("Mid Time: " +  midTime);
	out.println("End Time: " +  endTime);
	out.println("Increasing Delta: " + (midTime - startTime));
	out.println("Decreasing Delta: " + (endTime - midTime));
	}		        			
}
