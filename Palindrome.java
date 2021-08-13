package Week1.Day2;

public class Palindrome {
	
	public static void main(String args[])
	{
		String str = "madam";
		
		String rev = "";
		
		int lenght = str.length();
		
		for(int i = lenght-1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
//			System.out.println(rev);
		}
		if(str.equals(rev))
		{
			System.out.println("The string is a Palindrome");
		}
		else
		{
			System.out.println("The string not is a Palindrome");
		}
	}

}
