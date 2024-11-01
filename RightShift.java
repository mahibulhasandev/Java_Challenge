import java.util.Scanner;
public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Showcase of RightShift Operator\n");
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("your result is : " + result);
    }
}