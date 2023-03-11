import java.util.Scanner;

public class Lab22IfClass {
    public static void main(String[] args) {
        Scanner scan_double = new Scanner(System.in);
        Scanner scan_str = new Scanner(System.in);
        String str;
        char member;
        double price;

        System.out.print("Please input price :");
        price = scan_double.nextDouble();
        System.out.print("Are you my member? :");
        str = scan_str.next();
        member = str.charAt(0);
        if (member == 'N') {
            System.out.println("You price is " + (int) price + " bath. Thank you");
        } else {
            System.out.println("You discount is " + (int) (price * 10 / 100) + " baht");
            price = price - (price * 10 / 100);
            System.out.printf("You price is " + price + "\b\b" + " Thank you");
        }
    }
}
