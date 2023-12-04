
public class program13 {
	public static void main(String[] args)
	{
		// CONVERTING FIRST LETTER OF WORD IN CAPITAL LETTER
		String s = "I am Learning java";
		// Converting the string into character type arrar
		char [] arr = s.toCharArray();
		for(int i=0; i<=arr.length-1; i++)
		{
		
			if(i==0)
			{
				// If first letter is between A && Z
				if(arr[i]>='A'&& arr[i]<='Z')
				{
					// convert it into a to z
					int temp = arr[i];
					temp = temp+32;
					arr[i]=(char)temp;
				}
			}
			// If there is space then increment the value
			else if(arr[i]==' ')
			{
				i++;
				// If first letter is between A && Z
				if(arr[i]>='A' && arr[i]<='Z')
				{
					int temp = arr[i];
					temp = temp+32;
					arr[i] = (char)temp;
				}
			}
		}
		// Converting the char type array into String
		String str = new String (arr);
		System.out.println(str);

	}

}
