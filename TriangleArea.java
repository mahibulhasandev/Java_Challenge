import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your base in cms: ");
        double base = input.nextDouble();
        System.out.print("Enter your perpendicular height in cms:  ");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
                    // (base * height) / 2;
        System.out.println("The Rectangle is : " + area + "cms2");
    }
}