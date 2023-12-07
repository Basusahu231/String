package com.classWork.java;
import java.util.*;
public class lowerToUpper2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		String name = scan.nextLine();
		char [] ch = name.toCharArray();
		for(int i =0; i<=ch.length-1; i++)
		{
			if(i==0)
			{
				if(ch[i]>='a' && ch[i]<='z' )
				{
					ch[i] = (char)(ch[i]-32);
				}
			}
			else if(ch[i]==' ')
			{
				i++;
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i] = (char)(ch[i]-32);
				}
			}

		}
		String newstr = new String(ch);
		System.err.println(newstr);
	}
}
