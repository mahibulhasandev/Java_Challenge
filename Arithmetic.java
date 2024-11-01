import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Calculator \n");

        // user input 

        System.out.print("Enter Your First Number: ");
        int first = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int second = input.nextInt();


        // Calculation 
        
        int add = first + second;
        int sub = first - second;
        int multi = first * second;
        int div = first / second;
        int mod = first % second;
        

        // Value Output
        System.out.println("Addition is : " + add);
        System.out.println("Subtruction is : " + sub);
        System.out.println("Multiplication is : " + multi);
        System.out.println("Division is : " + div);
        System.out.println("Modulus is : " + mod);

    }
}