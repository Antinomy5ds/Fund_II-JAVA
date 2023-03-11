import java.util.*;

public class AddRandom {
    public static void main(String[] args) {
        double num1, num2, num3;
        Random rd = new Random();
        num1 = rd.nextDouble(50) + 1;
        num2 = rd.nextDouble(50) + 1;

        num3 = num1 + num2;

        System.out.println("Sum of " + num1 + " + " + num2 + " = " + num3);

        if (num3 > 50) {
            System.out.println("Value = PASS");
        } else {
            System.out.println("Value = Not PASS");
        }

    }
}
