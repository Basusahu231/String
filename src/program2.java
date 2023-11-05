import java.util.*;
public class program2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String  s = scan.nextLine();
		char [] ch = s.toCharArray();
		for(int i =0; i<=ch.length-1; i++)
		{
			if(i==0) 
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i] = (char)(ch[i]-32);
				}
			}
			else if(ch[i]==' ')
			{
				i++;
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i] = (char)(ch[i]-32);
				}
			}
		}
		String arr = new String(ch);
		System.out.println(arr);

	}

}
