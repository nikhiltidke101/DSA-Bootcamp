import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	System.out.print("Enter a number to cheak it is even or odd: ");
	int num = ss.nextInt();
	if(num%2==0)
	System.out.println("Number is EVEN");
	else
	System.out.println("Number is ODD");
    }
}