package com.method.java;
import java.util.*;
public class program1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "Kodnest Technologies pvt ltd";
		System.out.println("Enter  the index");
		int index = scan.nextInt();
		int len  = length(s);
		String str = stringu(s);
		String strr = stringl(s);
		boolean res = empty(s);
		char ch = Char(s,index);
		int index1 = ind(s);
		int indexx = index(s);
		char [] arr = ch(s);
//		
	}
	public static int length(String s )
	{
		int len = s.length();
		System.out.println(len);
		return len;
	}
	public static String stringu(String s)
	{
		String str = s.toUpperCase();
		System.out.println(str);
		return str;
	}
	public static String stringl(String s)
	{
		String str  =s.toLowerCase();
		System.out.println(str);
		return str;
	}
	public static boolean empty(String s)
	{
		boolean res = s.isEmpty();
		System.out.println(res);
		return res;

	}
	public static char Char(String s , int index)
	{
		char ch = s.charAt(index);
		System.out.println(ch);
		return ch;
	}
public static int ind(String s)
{
	int index = s.indexOf('d');
	System.out.println(index);
	return index;
	
}
public static int  index(String s)
{
	int indexx= s.lastIndexOf('t');
	System.out.println(indexx);
	return indexx;
}
public static char [] ch(String s)
{
	char []  arr = s.toCharArray();
	System.out.println(arr);
	return arr;
	
}
public static String [] str(String s)
{
	String [] arr1 = s.split(" ");
	System.out.println(arr1);
	return arr1;
}
}
