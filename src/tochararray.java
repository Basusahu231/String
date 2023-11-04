import java.util.*;
// converting STRING INTO ARRAY 

public class tochararray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a string ");
	String s = scan.nextLine();
	char [] arr = s.toCharArray();
	
for(char ch : arr)
{
	System.out.print(ch + " ");
}
System.out.println();
}
}
