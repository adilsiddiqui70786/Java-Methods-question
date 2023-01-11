//4th... to get Using input using Scanner program in java... 
import java.util.Scanner;
public class userinputting 
{
        public static void main(String[] args) 
   {
        int p;
        float m;
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        a = input.nextLine();
        System.out.println("You entered string "+a);
        System.out.println("Enter an integer");
        p = input.nextInt();
        System.out.println("You entered integer "+p);
        System.out.println("Enter a float");
        m = input.nextFloat();
        System.out.println("You entered float "+m);

    }
}
