package com.revision.java;

public class program1 {
	public static void main(String[] args) {
		String s = "I am learning java";
		char [] arr = s.toCharArray();
		char [] arr1 = new char[arr.length];

		for(int i=0; i<=arr.length; i++)
		{
			if(arr[i]==' ')
			{
				arr1[i]=' ';

			}
		}
		String arr2 = s.replace(" ", "");
		
		int x =0; 
		for(int i=arr2.length()-1; i>0; i--)
		{
			if(arr1[x]==' ')
			{
				i++;
			}
			arr1[x]=arr2.charAt(i);
		}
		String   strr = new String (arr1);	
		System.out.println(strr);
		
	}
}

