import java.util.Scanner;

public class Q10
{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a word or sentence:");
       String str = in.nextLine();
       
       str += " "; //Add space at end of string
       String word = "", lWord = "";
       int len = str.length();
       
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
           if (ch == ' ') {
               
                if (word.length() > lWord.length())
                    lWord = word;
                    
                word = "";
           }
           else {
               word += ch;
           }
       }
       
       System.out.println("The longest word: " + lWord);
    }
    
}