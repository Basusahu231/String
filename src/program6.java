import java.util.*;
public class program6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "Java Sql html";
		char [] arr = s.toCharArray();
		char[] arr1  = new char [arr.length]; 
		int j = arr1.length-1 ;
		for(int i = 0; i<=arr.length; i++)
		{
			arr1[j] = arr[i];
			j--;
		}
		String   strr = new  String (arr1);
		System.out.println(arr);
	}
}
