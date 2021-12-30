import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {
        
        int num1, num2, num3,gre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
	System.out.println("Enter Third Number: ");
        num3 = sc.nextInt();
        
        sc.close();

        gre=(num1>=num2)?num1:num2;
	gre=(gre>=num3)?gre:num3;
        System.out.println("Greatest of these numbers is : "+gre);
    }
}