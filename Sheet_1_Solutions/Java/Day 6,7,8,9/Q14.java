import java.util.Scanner;
public class Q14 
{

	public static void main(String[] args) 
	{
	//Take input from the user
        //Create instance of the Scanner class
	Scanner ss = new Scanner(System.in);  
	System.out.println("Enter the two number : ");
	int low = ss.nextInt();
	int high = ss.nextInt();

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}