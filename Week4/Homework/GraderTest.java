import java.util.Scanner;

public class GraderTest {
    public static void main(String[] args) {
        int i;
        double score;
        String name;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Course name: ");
        name = scan.nextLine();
        Grader grade = new Grader(name);
        System.out.print("Enter number of students: ");
        i = scan.nextInt();

        System.out.println("Input scores");
        for (int j = 0; j < i; j++) {
            score = scan.nextDouble();
            grade.addScore(score);
        }
        System.out.printf("Mean of %s =  %.2f\n", grade.getCourseName(), grade.mean());
        System.out.printf("Below mean = %d\n", grade.belowMean());
        System.out.printf("Above mean = %d\n", grade.aboveMean());
        grade.showGrade();
        System.out.println("");
        for (int k = 0; k < 20; k++) {
            System.out.print("#");
        }
    }
}
