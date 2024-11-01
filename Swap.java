import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Welcome To Swapping Station \n\n");
        System.out.print("Enter Value Of A : ");
        int a = input.nextInt();
        System.out.print("Enter Value Of B : ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("\nSwapping Done.....");
        System.out.println("\nValue Of A Is : " + a);
        System.out.println("Value Of B is : " + b);

    }
}