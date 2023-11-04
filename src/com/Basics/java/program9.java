package com.Basics.java;
import java.util.*;
public class program9 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String 1 :");
	String s = scan.nextLine();
	System.out.println("Enter the String 2 : ");
	String 	 q = scan.nextLine();
	boolean t = s.equalsIgnoreCase(q);
	System.out.println(t);
}
}
