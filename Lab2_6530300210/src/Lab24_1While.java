import java.util.Scanner;

public class Lab24_1While {
    public static void main(String[] args) {
        int i, N;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ener N :");
        N = scan.nextInt();

        i = N;
        while (i >= 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
