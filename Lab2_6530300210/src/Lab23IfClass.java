import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Lab23IfClass {
    public static void main(String[] args) {
        int age, height;
        System.out.print("Please input your age : ");
        Scanner sc_age = new Scanner(System.in);
        age = sc_age.nextInt();
        System.out.print("Please input you height : ");
        Scanner sc_h = new Scanner(System.in);
        height = sc_h.nextInt();

        if (age <= 10) {
            if (height < 100) {
                System.out.println("Your ticket price is 0 bath");
            } else {
                System.out.println("You ticket price is 890 bath");
            }
        } else {
            System.out.println("Your ticket price is 1190 bath");
        }
    }

}
