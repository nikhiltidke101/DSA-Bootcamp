// Calculate the power of a number in Java using while loop
import java.io.*;
import java.util.Scanner;
public class Q11 {
	public static void main(String[] args)
	{
		Scanner ss = new Scanner (System.in);
		int base,power;
		int result = 1;
		System.out.println("Enter base");
		base=ss.nextInt();
		System.out.println("Enter power");
		power=ss.nextInt();
		// running loop while the power > 0
		while (power != 0) {
			result = result * base;
			// power will get reduced after
			// each multiplication
			power--;
		}
		System.out.println("Result = " + result);
	}
}
