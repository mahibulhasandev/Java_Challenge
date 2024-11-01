import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New Year calculator\n");
        System.out.print("Pleace Enter the year that you want to check: ");
        int year = input.nextInt();
        
        // shutcut

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Your Year is Leap Year");
        } else {
            System.out.println("Your Year is Not Leap Year");
        }

        // longly
        // if (year % 400 == 0) {
        //     System.out.println("Your year is a leap year");
        // } else if (year % 100 == 0) {
        //     System.out.println("Your year is not a leap year");
        // } else if (year % 4 == 0) {
        //     System.out.println("your year is a leap year");
        // } else {
        //     System.out.println("Your year is not a leap year");
        // }
    }
}