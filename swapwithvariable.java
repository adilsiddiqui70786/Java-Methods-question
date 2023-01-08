//6th ... SWAP THE NUMBERS WITH THIRD VARIABLE...
import java.util.Scanner;
public class swapwithvariable 
{
    public static void main(String[] args)
     {
        int p , m , a;
        Scanner pma = new Scanner(System.in);
        System.out.println("Value of P = ");
        p = pma.nextInt();
        System.out.println("Value of M = ");
        m = pma.nextInt();
        a = p;
        p = m;
        m = a;
        System.out.println("NOW..");
        System.out.println("Value of M = " +m);
        System.out.println("Value of P = " +p);
    }
}
