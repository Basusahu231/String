package com.classWork.java;
import java.util.*;
public class reverseString2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println(" enter the string");
	String str = scan.nextLine();
	char [] ch = str.toCharArray();
	String newch= "";
	for(int i =ch.length-1; i>=0; i--)
	{
		newch = newch+ch[i];
	}
	String newstr = new String(newch);
	System.out.println(newstr);
	
}
}
