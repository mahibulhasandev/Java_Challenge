public class MaxArray {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum\n");
        int[] arr = ArryUtility.inputArry();

        int max = Integer.MIN_VALUE;
        for (int  num: arr) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}
