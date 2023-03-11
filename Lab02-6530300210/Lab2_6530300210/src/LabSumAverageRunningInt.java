import java.util.Scanner;

public class LabSumAverageRunningInt {
    public static void main(String[] args) {
        double min, max, sum = 0, result = 0, total;
        double avg;
        Scanner sc_number = new Scanner(System.in);
        System.out.print("Enter the lower bound value :");
        min = sc_number.nextInt();
        System.out.print("Enter the upper bond value: ");
        max = sc_number.nextInt();
        double i = min;
        do {
            sum += i + result;
            i++;
        } while (i <= max);

        total = (max - min) + 1;
        avg = sum / total;
        System.out.println("The sum of " + (int) min + " to " + (int) max + " is " + (int) sum);
        System.out.println("The average is " + avg);

    }

}
