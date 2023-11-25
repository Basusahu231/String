
public class program11 {
public static void main(String[] args) {
	String s = "hello world";
	char[] arr = s.toCharArray();
	char [] arr1  = new char [arr.length];
	int j =0; 
	for(int i =4; i>=0; i-- )
	{
		arr1[j]=arr[i];
		j++;
	}
	int a= arr.length-1;
	for(int i =6; i<=arr.length-1; i++)
	{
		arr1[i]=arr[a];
		a--;
	}
	String str = new String (arr1);
	System.out.println(str);
	
}
}
