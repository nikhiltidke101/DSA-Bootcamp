import java.util.Scanner;
public class Q6 {

    public static void main(String[] args) {
        
        int num1, num2, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        temp=num1;
	num1=num2;
	num2=temp;
	
        System.out.println("Swaped numbers are: "+num1+"   "+num2);
    }
}