import java.util.Scanner;
class Q10 {
  public static void main(String[] args) {
	//int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base:");
    	int base = s.nextInt();
	System.out.print("Enter the Exponent:");
    	int expo = s.nextInt();
	
    	double result = Math.pow(base, expo);
	
   	 System.out.println("Answer = " + result);
  }
}