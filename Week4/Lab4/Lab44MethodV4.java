public class Lab44MethodV4 {
    public static double calAverage(int[] input) {
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            System.out.printf("%5d", input[i]);
            sum = sum + input[i];
        }
        System.out.println("");
        return (double) (sum / input.length);
    }

    public static void main(String[] args) {
        double average;
        int[] data = { 120, 98, 152, 90, 82 };
        average = calAverage(data);
        System.out.printf("Average : %f", average);
    }
}
