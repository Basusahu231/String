package com.revision.java;
import java.util.*;
public class tocharArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Taking the string from the user input 
		System.out.println("Enter the string");
		String s = scan.nextLine();
		// Taking the index from user input
		System.out.println("Enter the index of character");
		int ind = scan.nextInt();
		tochar(s,ind);
	}
	// Using method to find the character at specific index
	public static void tochar(String s , int ind)
	{
		System.out.println( "the character present at " + ind +  " is : "  + s.charAt(ind));
	}
}
