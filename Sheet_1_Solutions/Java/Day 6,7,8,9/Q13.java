import java.util.Scanner;
public class Q13 
{
	public static void main(String[] args) 
	{
		//Take input from the user
       		//Create instance of the Scanner class
       		Scanner ss = new Scanner(System.in);  
      		System.out.println("Enter the number ");
		int num = ss.nextInt();
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) 
		{
			if (num % i == 0) 
			{
			flag = true;
			break;
			}
		}
		if (!flag)
		System.out.println(num + " is a prime number");
		else
		System.out.println(num + " is not a prime number");
	}
}