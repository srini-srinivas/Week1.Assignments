package Week1.Day2;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String args[])
	{
		int[] list = {23,34,5,19,3,75,96,303,2};
		Arrays.sort(list);
		
		System.out.println("The second largest element in the array is : " +list[list.length-2]);
	}
	

}
