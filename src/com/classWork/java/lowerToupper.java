package com.classWork.java;
import java.util.*;
public class lowerToupper {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = scan.nextLine();
	String [] st = str.split(" ");
	for(int i =0; i<=st.length-1; i++)
	{
		if(st[i].charAt(0)>='a' && st[i].charAt(0)<='z')
		{
			char temp =st[i].charAt(0);
			 char newtemp =(char)(temp-32);
			st[i]= newtemp+st[i].substring(1);
		}
	}
	String res = "";
	for(int i =0; i<=st.length-1; i++)
	{
		
		res =res + st[i]+ " ";
	}
	System.out.println(res);

}
}
