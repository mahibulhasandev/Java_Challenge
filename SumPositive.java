public class SumPositive {
    public static void main(String[] args) {
        System.out.println("Welcome to adding possitive numbers");
        int[] numArr = ArryUtility.inputArry();

        int sum = 0;
        for (int num: numArr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of possitive number is : " + sum);
    }
}
