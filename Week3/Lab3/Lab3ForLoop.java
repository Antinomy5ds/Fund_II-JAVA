import java.util.Scanner;

public class Lab3ForLoop {
    public static void main(String[] args) {
        int i, N;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N :");
        N = scan.nextInt();

        for (i = 1; i <= N; i++) {
            System.out.println(i * 7);
        }
        scan.close();
    }
}
