import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter your character to cheak it is vowel or consonant");
        String str = ss.next();

	char ch = str.charAt(0);

        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='O'||ch=='o'||ch=='u'||ch=='U')
	System.out.println("Character is VOWEL");
	else
        System.out.println("Character is CONSONANT");
        
    }
}