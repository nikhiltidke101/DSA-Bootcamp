import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter a number to find factorial : ");
	int num = ss.nextInt();
	
	int i,fact=1;
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
	}
      
        System.out.println("Factorial is: " + fact);
    }
}