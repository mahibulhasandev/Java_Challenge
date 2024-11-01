import java.util.Scanner;
public class BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And Operator \n");
        System.out.print("Please Enter The First Number: ");
        int first = input.nextInt();
        System.out.print("Now, Enter The Other Number: ");
        int second = input.nextInt();

        int result = first | second;
        System.out.println("Result is : " + result);
    }
}