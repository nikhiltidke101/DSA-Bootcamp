import java.util.Scanner;
public class Q7 {

    public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter your character");
        String str = ss.next();

	char ch = str.charAt(0);

        int ascii = ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        
    }
}