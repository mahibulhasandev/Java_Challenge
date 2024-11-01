import java.util.Scanner;

    public class Sum {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate Only Sum");
        System.out.print("Enter The First Number : ");
        int first = input.nextInt();
        System.out.print("Enter The Second Number : ");
        int second = input.nextInt();
        int sum = first + second; 
        System.out.println("Your Sum = " + sum);


    }
}