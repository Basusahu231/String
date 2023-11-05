import java.util.*;
public class program1 
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter a String");
String  s  = scan.nextLine();
char [] ch = s.toCharArray();
for(int i =0; i<=ch.length-1; i++)
{
	if(ch[i]>='A' && ch[i]<='Z')
	{
		int temp = ch[i];
		temp = temp+32;
		ch[i] = (char)temp;
	}
	else
	{
		int temp = ch[i];
		temp  = temp-32;
		ch[i] = (char)temp;
	}

}
String t = new String(ch);
System.out.println(t);
	

	}
	}

