package Week1.Day2;

public class FindType {
	
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		
		
		for(int i = 0; i < test.length(); i++)
		{
			char ch=test.charAt(i);
			
			if(ch >= 'A' && ch<='Z' || ch>='a' && ch<='z') {
				letter++;
			}
			
			else if(ch>='0' && ch<='9'){
				num++;
			}
			
			else if(ch ==' '){
				space++;
			}
			
			else{
				specialChar++;
			}
		}
		System.out.println("\nAlphabet letters: "+letter);
		System.out.println("Number: "+num);
		System.out.println("Space: "+space);
		System.out.println("Special characters: "+specialChar);

		}
		}
		
		

