
public class nested_ifelse {

	public static void main(String[] args) 
	{
		int num1=20,num2=100,num3=45;
		if(num1>num2)                      //20>10
		{
			if(num1>num3)                  //  20>45
			{
				System.out.print("Maximum number: "+num1);
			}
			else
			{
				System.out.print("Maximum number: "+num3);

			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.print("Maximum number: "+num2);

			}
			else
			{
				System.out.print("Maximum number: "+num3);

			}
		}

		
		
		
		
	}

}
