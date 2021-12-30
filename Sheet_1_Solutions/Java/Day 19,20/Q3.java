import java.util.Scanner;

public class Q3
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        	double mean, deviation,number;				
		mean = deviation = 0;	// Set mean and deviation to 0

		System.out.print("Enter N:");
        	int SIZE = input.nextInt();

		// Compute mean and standard deviation
		for (int i = 1; i <= SIZE; i++) {
			number = input.nextDouble();
			mean += number;
			deviation += Math.pow(number, 2); 
		}
		deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / SIZE)) / (SIZE - 1));
		mean /= SIZE;

		// Display results
		System.out.println("The mean is " + mean);
		System.out.printf("The standard deviation is %.5f\n", deviation);
	}
}
        