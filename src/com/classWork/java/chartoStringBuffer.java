package com.classWork.java;
import java.util.*;
public class chartoStringBuffer {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
System.out.println("Enter the string");
String st  = scan.nextLine();
//converting the string into char [] arrayn
char [] arr = st.toCharArray();
// creating stringBuffer object
StringBuffer sb = new StringBuffer();
// Storing char array element in the stringBuffer object
for( char ch : arr)
{
	sb.append(ch);
}
// printing the mutuble string
System.out.println( "createdstring : " + sb);
}	
}
 