package Week1.Day2;

public class Odd {
	
	public static void main(String args[])
	{
		int i;
		for(i=0;i<=20;i++)
		{
			if(i%2!=0)
			{
			    continue;
			}
			else if(i%2==1)
			{
			     System.out.println(i);
			}    
		}
	}

}
