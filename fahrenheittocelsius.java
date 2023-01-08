//5TH ... CONVERT THE FARHENHIET TEMPRATURE INTO CELSISUS...
import java.util.Scanner;
public class fahrenheittocelsius
{
    public static void main(String[] args)
     {
        System.out.println("Want Temperature in Celsius ?");
        float temperature;
        System.out.println("Temperature in fahrenhiet :");
        Scanner pma = new Scanner(System.in);
        temperature = pma.nextInt();
        temperature = (temperature-32)*5/9;
        System.out.println("Temperture in Celsius = " +temperature);

    }
}