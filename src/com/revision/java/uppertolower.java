package com.revision.java;

public class uppertolower {
	public static void main(String[] args) {
		String s = "Hello world i Am  Java developer ";
		char[] arr = s.toCharArray();
		for(int i =0; i<=arr.length-1; i++)
		{
			if(i==0)
			{
				if(arr[i]>='A' && arr[i]<='Z')
				{
					int temp =arr[i];
					temp = temp+32;
					arr[i]=(char)temp;
				}
			}
			else if(arr[i]==' ')
			{
				i++;
			if(arr[i]>='A' && arr[i]<='Z')
			{
				arr[i] = (char)(arr[i]+32);
			}
			}
			
		}
String str = new String (arr);
System.out.println(str);
	}
}
