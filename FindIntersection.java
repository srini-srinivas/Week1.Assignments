package Week1.Day2;

public class FindIntersection {
	
	public static void main(String args[])
	{
		int[] set1 = {2,3,8,94,43,17,9};
		int[] set2 = {63,4,33,2,11,9,5};
		
		for(int i=0; i < set1.length; i++) {
			for(int j=0; j < set2.length; j++) {
				if(set1[i] == set2[j])
				{
					System.out.println("Matching elements are : "+set1[i]);
				}
			}
		}
	}

}
