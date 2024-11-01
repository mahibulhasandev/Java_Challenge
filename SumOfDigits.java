import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of digits\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits is : " + sum);
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
             sum += num % 10;
             num /= 10;
        }
        return sum;
    }
}