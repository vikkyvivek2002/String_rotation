import java.util.Scanner;
class String_rotation
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two strings ");
		String s1 = s.next();
		String s2 = s.next();
		
		if(s1.length() != s2.length())
		{
			System.out.println(" NO ");
		}
		
		else
		{
			 String s3 = s1+s1;
			 if(s3.contains(s2))
			 {
				 System.out.println(" YES ");
			 }
			 else
			 {
				 System.out.println(" NO ");
			 }
		}
		
	}

}
