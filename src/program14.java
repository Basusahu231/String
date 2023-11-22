
public class program14 {
	public static void main(String[] args) {
		String s = "I am learning java";
		char [] arr = s.toCharArray();
		char [] arr1 = new char[arr.length];
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]==' ')
			{
				arr1[i] = ' ';
			}
		}
//		String str = new String(arr1);
		String st = s.replaceAll(" ", "");
		char [] strr = st.toCharArray();
		int j =0; 
		for(int i = strr.length-1; i>=0; i--)
		{
			if(arr1[j] == ' ')
			{
				j++;
			}
			arr1[j]=strr[i];
			j++;
			
		}
		String strrr = new String (arr1);
        System.out.print(strrr);
   
	} 
}
