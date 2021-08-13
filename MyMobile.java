package Week1.Day2;

public class MyMobile 
{
public void makeCall()
{
	System.out.println("Hi How are you");
}
public void takeSnap() {
	System.out.println("say cheeseeeee");
}
private void createPassword()
{
	System.out.println("********");
}
public static void main(String args[])
{
	MyMobile obj = new MyMobile();
	
	obj.makeCall();
	obj.takeSnap();
	obj.createPassword();
}
}