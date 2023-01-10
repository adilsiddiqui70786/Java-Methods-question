// 7th.. SWAP THE NUMBERS WITHOUT VARIAVBLE ...
import java.util.Scanner;
public class swapnumber {
    public static void main(String[] args) 
    {   
        int A , B ;
        Scanner pma = new Scanner(System.in);
        System.out.println("value of A =");
        A = pma.nextInt();
        System.out.println("VALUE OF B =");
        B = pma.nextInt();
        A = A+B;
        B = A-B;
        A = A-B;
        System.out.println("NOW...");
        System.out.println("VALUE OF B = " +B);
        System.out.println("VALUE OF A = " +A);
    }
}
