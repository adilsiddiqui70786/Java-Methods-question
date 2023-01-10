//8TH .. ADD TWO NUMBERS..
import java.util.Scanner;
public class addnumber {
    public static void main(String[] args) {
        int p , m , a;
        System.out.println("enter the two numbers for Adding :");
        Scanner pma = new Scanner(System.in);
        p = pma.nextInt();
        m = pma.nextInt();
        a = p+m;
        System.out.println("TOTAL = " +a);
    }
}
