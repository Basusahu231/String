package com.classWork.java;
import java.util.*;
public class upperToLower {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = scan.nextLine();
		char [] ch = name.toCharArray();
		for(int i =0; i<=ch.length-1; i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				int temp = ch[i];
				  temp = temp+32;
				  ch[i] = (char)temp;
			}
			else if( ch[i]>='a' && ch[i]<='z')
			{
				int temp = ch[i];
				  temp = temp-32;
				  ch[i] = (char)temp;
			}
		}
		String newStr = new String(ch);
		System.out.println(newStr);
	}
}
