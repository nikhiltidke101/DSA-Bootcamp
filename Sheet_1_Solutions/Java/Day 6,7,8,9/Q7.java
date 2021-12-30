//Java Program to Calculate the LCM of two numbers
import java.util.Scanner;  
public class Q7   
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
        int lcm = (num1 > num2) ? num1 : num2;
        // Always true
        while(true) 
        {
           if( lcm % num1 == 0 && lcm % num2 == 0 ) 
           {
               System.out.printf("The LCM of "+num1+" and "+num2+" is "+lcm);
               break;
            }
         ++lcm;
        }
   }  
}  