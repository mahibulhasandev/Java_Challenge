import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("calculate Greatest Of Three\n");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        System.out.print("Enter you third number : ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println("first is the greatest number : " + first);
        } else if (second >= first && second >=third) {
            System.out.println("second is the greatest number : " + second);
        } else {
            System.out.println("third is the greatest number : " + third);
        }

    }
}