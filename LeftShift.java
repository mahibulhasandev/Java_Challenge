import java.util.Scanner;
public class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Showcase of LeftShift Operator\n");
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();

        int result = num << 4;
        System.out.println("your result is : " + result);
    }
}