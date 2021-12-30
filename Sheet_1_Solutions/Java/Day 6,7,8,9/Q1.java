import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter a number to which u have to find the sum: ");
	int num = ss.nextInt();
	
	int i,sum=0;
	for(i=0;i<=num;i++)
	{
		sum=sum+i;
	}
      
        System.out.println("Sum is: " + sum);
    }
}