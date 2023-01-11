//11...IF ELSE CONDIONN BASED JAVA PROGRAM..
import java.util.Scanner;
public class condition2 {
    public static void main(String[] args) {
        int marksobtained , passingmarks;

        passingmarks = 40;
        
        Scanner pma = new Scanner(System.in);
        System.out.println("Input the marks which you scored..");

        marksobtained = pma.nextInt();

        if(marksobtained>= passingmarks)
        {
            System.out.println("yehh , you passed the exam..");

        }
        else
        {
            System.out.println("oops , you failed in  the exam..");
        }
    }
}
