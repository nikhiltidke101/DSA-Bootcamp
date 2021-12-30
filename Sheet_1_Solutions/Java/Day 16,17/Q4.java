import java.util.Scanner;
class Q4
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
     System.out.println("Enter base");
     int base=sc.nextInt();
     System.out.println("Enter exponent");
     int exponent=sc.nextInt();
     System.out.println("Power("+base+"^"+exponent+") = "+power(base,exponent));
 
    	}
 
 static int power(int b,int e)
 {
 if(e==0)
         return 1;
     else 
         return (b*power(b,e-1)); 
 }
}