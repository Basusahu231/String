package com.classWork.java;
import java.util.*;
public class reverseString {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = scan.nextLine();
	char [] arr = str.toCharArray();
	 String strr = "";
	for(int i = arr.length-1 ; i>=0; i--)
	{
	strr = strr+arr[i];
	}
	String newstr = new String (strr);
	System.out.println(strr);
	// checking the number is palindrome or not 
	if(str.equals(newstr))
	{
		System.out.println("palindrome number");
	}
	else
	{
		System.out.println("not a palindrome");
	}
} 
}
