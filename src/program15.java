
public class program15 {
	public static void main(String[] args) {
		String s ="I am learning java";
		String [] arr = s.split(" ");
		String [] arr1 = new String [arr.length-1];
		int j=0;
		for(int i =arr.length-1; i>0; i--)
		{
			arr1[j]=arr[i];
			j++;
		}
		String newstr ="";

		for(int i =0; i<=arr1.length-1; i++)
		{
			newstr = newstr+(arr1[i]+" ");
		}
		System.out.println(newstr);
	}
}
