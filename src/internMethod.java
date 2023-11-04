
public class internMethod {
public static void main(String[] args) {
	String s1 = new String ("kodNest");
	System.out.println(s1);
 String 	s2 = s1.intern(); 
 System.out.println(s2);
 String s3 = s2;
 System.out.println(s3);
 if(s2==s3)
 {
System.out.println("Refer are equals");	 
 }
 else {
	 System.out.println("Refer are not equal");
 }

}
}
