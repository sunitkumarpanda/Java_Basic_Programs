import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {

		int num;
		System.out.print("Enter any number:  ");
		Scanner s=new Scanner(System.in);
		
		num=s.nextInt();
		while(num>=0) 
		{
			if(num%2==0)
			{
				System.out.print("Even number");
				break;
			}
			else
			{
				System.out.print("Odd number");
				break;
			}
		}
		System.out.print("While loop Ended");
		
	}

}
