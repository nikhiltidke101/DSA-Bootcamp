/* Java program to remove all characters in a string except alphabets */
import java.util.Scanner;

class Q3 {

public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.print("Enter String : ");
     String s = sc.nextLine();
     s=s.replaceAll("[^a-zA-Z]","");
     System.out.println(s);
   }
}