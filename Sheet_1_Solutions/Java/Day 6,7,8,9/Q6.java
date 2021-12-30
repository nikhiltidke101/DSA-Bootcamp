//Java Program to Calculate the GCD of two numbers
import java.util.Scanner;  
public class Q6
{  
    public static void main(String[] args)    
    {
        //Take input from the user
        //Create an instance of the Scanner class
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the first number: ");  
        int num1 = sc.nextInt();  
        System.out.println("Enter the second number: ");  
        int num2 = sc.nextInt();  
        int hcf=0;
        for(int i = 1; i <= num1 || i <= num2; i++) 
        {
         if( num1%i == 0 && num2%i == 0 )
         hcf = i;
      }
      System.out.println("HCF of given two numbers is :"+hcf);
   }  
}  