import java.util.Scanner;
public class Q4 {

    public static void main(String[] args) {
        
        int divs, divd, rem, quo ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Divisor : ");
        divs = sc.nextInt();
        
        System.out.println("Enter Dividend: ");
        divd = sc.nextInt();
        
        sc.close();
        //dividend = divisor *  quotient + remainder 

	rem = divd % divs;
	quo = divd / divs;
        System.out.println("Quotient is: "+quo);
	System.out.println("Remainder is: "+rem);
    }
}