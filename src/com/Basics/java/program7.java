package com.Basics.java;
import java.util.*;
public class program7 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// enter the String 
	System.out.println("Enter the String ");
	String name = scan.nextLine();
	// enter the index 
	System.out.println("Enter the index");
	int  index = scan.nextInt();
	// calling ch method
	char n = ch(name, index);
	System.out.println("char at index " + index   + " is : " + n);
	
	
}
// using ch method 
public static char ch(String name , int index)
{
	// using .charAt method 
	char n = name.charAt(index);
	return n;
}
}
