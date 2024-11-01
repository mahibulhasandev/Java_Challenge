import java.util.Scanner;
public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise and operator\n");
        System.out.print("Please Enter First number: ");
        int first = input.nextInt();
        System.out.print("Now, Enter the other number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("result is : " + result);
        
    }
}