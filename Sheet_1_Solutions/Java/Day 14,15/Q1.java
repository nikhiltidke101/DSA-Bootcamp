import java.util.Scanner;

public class Q1
{
	public static void main(String[] args) {
	//Take input from the user
        //Create instance of the Scanner class
	Scanner ss = new Scanner(System.in);  
	System.out.println("Enter the two number : ");
	int low = ss.nextInt();
	int high = ss.nextInt();
	while (low < high) 
	{
		if(checkPrimeNumber(low))
		System.out.print(low + " ");
		++low;
	}
}

public static boolean checkPrimeNumber(int num) 
{
	boolean flag = true;
	for(int i = 2; i <= num/2; ++i) 
	{
		if(num % i == 0) 
		{
			flag = false;
			break;
		}
	}
	return flag;
}
}