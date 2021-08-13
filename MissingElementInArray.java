package Week1.Day2;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		int[] list = {1,2,9,4,5,3,6,7};
		
		Arrays.sort(list);
		
		for(int i = 0; i  < list.length; i++) {
			
			int index = i + 1;
			if(list[i] != index)
			{
				System.out.println("missing element is : "+index);
				break;
			}
		}
	}
		
}
