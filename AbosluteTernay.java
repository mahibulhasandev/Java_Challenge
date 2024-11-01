import java.util.Scanner;
public class AbosluteTernay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Value\n");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute Value is : " + result);
    }
}
