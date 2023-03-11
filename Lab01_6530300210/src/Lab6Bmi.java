import java.util.Scanner;

public class Lab6Bmi {
    public static void main(String[] args) {
        double bmi, hgm;
        Scanner s = new Scanner(System.in);

        System.out.print("Input1 Mass: ");
        float mass = s.nextFloat();
        System.out.print("Input2 Height: ");
        float height = s.nextFloat();
        hgm = height / 100;

        bmi = (mass / (hgm * hgm));

        System.out.printf("Output BMI: " + "%.6f", bmi);
    }
}
