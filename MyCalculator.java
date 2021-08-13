package Week1.Day2;

public class MyCalculator {
	
	public static void main(String args[])
	{
		Calculator mycal = new Calculator();
		
		System.out.println(mycal.add(1, 1, 6));
		System.out.println(mycal.sub(5,4));
		System.out.println(mycal.mul(25, 5));
		System.out.println(mycal.div(9, 3));
		
	}

}
