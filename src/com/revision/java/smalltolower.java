package com.revision.java;

public class smalltolower {
	public static void main(String[] args) {
		String s = "HeLlO WoRlD";
		// Converting the string into char type array
		char [] arr = s.toCharArray();
		// Using loop to convert small case to upper case and vice verse
		for(int i =0; i<=arr.length-1; i++)
		{
			// If the character is in upper case then convert into lower case
			if(arr[i]>='A' && arr[i]<='Z')
			{
				int temp = arr[i];
				temp = temp+32;
				arr[i] = (char)temp;
			}
			// If the character is in lower case then convert it into upper case
			else if(arr[i]>='a'&& arr[i]<='z')
			{
				int temp = arr[i];
				temp = temp-32;
				arr[i] = (char)temp;
			}
		}
		// Converting the modify char [] into String 
		String str = new String (arr);
		System.out.println(str);

	}
}
