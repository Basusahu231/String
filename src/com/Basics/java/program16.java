package com.Basics.java;
import java.util.*;
public class program16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "hello World";
		System.out.println("Enter the index which to find character");
		int index  = scan.nextInt();
		charAt(s, index);
	}
	public static void charAt(String s , int index)
	{
		char st = s.charAt(index);
		System.out.println(st);
	}
}
