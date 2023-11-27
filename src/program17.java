import java.util.Scanner;

public class program17 {
public static void main(String[] args) {
	Scanner scan =  new Scanner(System.in);
	System.out.println("Enter the string ");
	String s = scan.next();
	char [] arr = s.toCharArray();
	char [] arr1 = new char[arr.length];
	int j =arr1.length-1; 
	for(int i =0; i<=arr.length-1; i++)
	{
		arr1[j]=arr[i];
		j--;
	}
	String str = new String(arr);
	System.out.println(str);
 String st = new String (arr1);
 System.out.println(st);
for(int i =0; i<=st.length()-1; i++)
{
	if(st==str)
	{
		System.out.println("palin");
	}
}
}
}