package gross_calculator;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        int hours = 0;
        double payRate = 0;

        System.out.println("Whats your hours");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        System.out.println("Whats your payRate");
//  Scanner scanner = new Scanner(System.in); No need to declare again
        payRate = scanner.nextDouble();
        scanner.close();

        double grossPay = hours * payRate;
        System.out.println("Gross Pay is " + grossPay);


    }
}
