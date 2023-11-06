import java.util.*;
public class program5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s ="Hello, world!";
		// Converting the string into char type of array
		char []  arr = s.toCharArray();
		// Creating one more array of same length for reversing and storing the value
		char [] arr1 = new char [arr.length];
		// Taking j variable which start from last index
		int j = arr1.length-1;
		// Reversing and storing the value in second array
		for(int i =0; i<=arr.length-1; i++)
		{
			arr1[j] = arr[i];
			j--;
		}
		// Converting the char type array into String 
		String ch = new String (arr1);
		// Printing the reversed string 
		System.out.println(ch);
	}
}
