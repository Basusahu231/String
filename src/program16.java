import java.util.*;
public class program16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scan.next();
		char [] arr = s.toCharArray();
		for(int i =0;  i<=arr.length-1; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(arr[j]);
			}
			System.out.println();
		}
		for(int i =0;  i<=3; i++)
		{
			for(int j=0; j<=i; j++)
			{
				if(j==0)
				{
				 j++;
				}
				System.out.print(arr[j]);		
			}
			System.out.println();
		}
	}
	}

