import java.util.Scanner;

public class condition_ifelse {

	private static Scanner obj;

	public static void main(String[] args) {

		int age;
		System.out.print("Enter password:= ");
	    obj = new Scanner(System.in);
	    age=obj.nextInt();
		if(age>=18)
		{
			System.out.println("You Are Elligible For Voating");
		}
		else
		{
			System.out.print("You Are Not Elligible For Voating");
		}
	}

}

