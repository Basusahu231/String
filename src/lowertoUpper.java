import java.util.*;
public class lowertoUpper {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		String s = scan.next();
		char [] arr = s.toCharArray();
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				int temp = arr[i];
				temp  = (temp+32);
				arr[i] = (char)temp;
			}
			 if(arr[i]==' ')
			{
				i++;
				if(arr[i]>='A' && arr[i]<='Z')
				{
					int temp = arr[i];
					temp  = (temp+32);
					arr[i] = (char)temp;
				}
			}
			else if(arr[i]>='a' && arr[i]<='z')
			{
				int temp  = arr[i];
				temp = (temp-32);
				arr[i] = (char)temp;
			}
		}
		String str = new String (arr);
		System.out.println(str);
	}
}
