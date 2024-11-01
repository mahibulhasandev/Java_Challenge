import java.util.Scanner;
public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Showcase of Not/Compliment Operator\n");
        System.out.print("Please Enter your number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("your result is : " + result);
    }
}