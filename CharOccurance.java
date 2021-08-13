package Week1.Day2;

public class CharOccurance {
	
	public static void main(String args[])
	{
		String greetings = "have a good day";
		int count = 0;
		
		char[] ch = greetings.toCharArray();
				
		for(int i = 0; i < greetings.length(); i++)
		{
			for (int j = i + 1; j < greetings.length(); j++) {
				if(ch[i] == ch[j])
				{
					System.out.println("The character of " +ch[j]+ " appears "+count+ " times");
					count++;
					break;
				}
				
			}
		}
	}

}
