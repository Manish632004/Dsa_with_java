import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in Degree celcius :");
        float tempC = in.nextFloat();
        float tempF = (tempC*9/5)+32;
        System.out.println("temperature in f :" + tempF);
    }
}
