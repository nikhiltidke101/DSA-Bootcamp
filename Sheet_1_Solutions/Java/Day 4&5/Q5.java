import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

       
        Scanner ss= new Scanner(System.in);
        System.out.print("Enter a year: ");

        
        int year = ss.nextInt();

        if(year%4==0)
        System.out.println("It's a leap year");
	else
	 System.out.println("It's a Ordinary year");
    }
}