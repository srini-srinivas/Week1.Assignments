package Week1.Day2;

public class OddIndexToUpperCase {
	
	public static void main(String args[])
	{
		String changeOdd = "waterfall";
		
	    StringBuffer updatedString = new StringBuffer(); 

		
		char[] characters = changeOdd.toCharArray();
		
		for(int index = 0; index < characters.length; index++ )
		{
			char c = characters[index];
			
			if(index % 2 != 0) {
				c = Character.toUpperCase(c);
				}
			
			updatedString.append(c);
			}
		
		System.out.println("Modified string is: " + updatedString.toString());
	}

}
