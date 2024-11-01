import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("your number is Prositive");
        } else if (num == 0 ) {
            System.out.println("Your Number is Zero");
        } else {
            System.out.println("Your number is Negative");
        }
    }
}