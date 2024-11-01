import java.util.Scanner;
public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Float Multiplication\n");

        // user input 

        System.out.print("Enter First Decimal Number: ");
        double first = input.nextDouble();
        System.out.print("Enter Second Decimal Number: ");
        double second = input.nextDouble();
        
        // Calculation

        // double add = first + second;
        // double sub = first - second;
        // double multi = first * second;
        // double div = first / second;
        // double mod = first % second;

        // Output with Calculation

        System.out.println("Addition is: " + (first + second));
        System.out.println("Subtruction is: " + (first - second));
        System.out.println("Multiplication is: " + (first * second));
        System.out.println("Division is: " + (first / second));
        System.out.println("Modulus is: " + (first % second));



    }
}