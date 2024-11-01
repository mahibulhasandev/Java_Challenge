public class ArrySunAvarage {
    public static void main(String[] args) {

        System.out.println("Welcome to  Arry sum Avarage\n");
        int[] numArray = ArryUtility.inputArry();
        long sum = sum(numArray);
        double avg = avarage(numArray);
        System.out.println("Sum of the number is : " + sum);
        System.out.println("Avarage of the number is: " + avg);

    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double avarage(int[] numArray) {
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}