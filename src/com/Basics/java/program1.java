package com.Basics.java;

public class program1 {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer("JAVA");
	StringBuffer s1 =  new StringBuffer ("JAVA");
	System.out.println(s==s1);
	System.out.println(s.equals(s1)); 
}
}
