import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compund Interest Calculator\n\n");
        System.out.print("Pleace Enter your principle amount BDT : ");
        int principle = input.nextInt();
        System.out.print("Now, Tell me your rate of Interest: ");
        float rate = input.nextFloat();
        System.out.print("Now tell me for how many years are you borrowing this money: ");
        float years = input.nextFloat();

        double compInt = principle * Math.pow((1 + rate / 100), years);
        System.out.println("Your compound interest is BDT: " + compInt);


    }
}