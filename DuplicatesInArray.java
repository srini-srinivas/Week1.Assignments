package Week1.Day2;

public class DuplicatesInArray {
	
public static void main(String[] args) {
	
	int[] arr = {5,6,7,8,5,9,1,2,6,3,4};
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = i+1; j < arr.length; j++) {
			if(arr[i] == arr[j])
			{
				System.out.println(arr[i]);
			}
		}
		
	}
	}
}
