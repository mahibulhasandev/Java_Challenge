import java.util.Scanner;
public class Grading {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator\n");
        System.out.print("Please enter your percentage : ");
        float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println("You have got A");
        } else if (percentage >= 75){
            System.out.println("You have got B");
        } else if (percentage >= 60) {
            System.out.println("You have got C, work harder next time");
        } else if (percentage >= 30) {
            System.out.println("You have got D, you need seriously need to work harder");
        } else {
            System.out.println("Sorry, You have failed test and got F");
        }
    }
}