import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value of A: ");
        double a = input.nextDouble();
        System.out.print("Enter value of B: ");
        double b = input.nextDouble();
        System.out.print("Enter value of C: ");
        double c = input.nextDouble();
        System.out.print("Enter value of D: ");
        double d = input.nextDouble();

        double result = a + b + c + d;

        System.out.println("Perimeter of Your Rectangle is : " + result + "cm");
    }
}