import java.util.Scanner;

public class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table\n");
        System.out.print("Enter the number Your want print table of: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
