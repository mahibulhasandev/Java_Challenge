import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even calculator");
        System.out.print("Enter Your Number : ");
        int num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("Your number is odd");
        } else {
            System.out.println("you number is even");
        }
    }
}