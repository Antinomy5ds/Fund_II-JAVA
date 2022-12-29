import java.util.Scanner;

public class Lab21ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NAME :");
        String name = sc.nextLine();
        System.out.print("Enter ID : ");
        String id = sc.nextLine();
        System.out.print("Enter Birthday(dd/mm/yy) : ");
        String bd = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.print("Enter GPA : ");
        float gpa = sc.nextFloat();

        System.out.println("My name is " + name);
        System.out.println("Birthday :" + bd + "\tAge : " + age);
        System.out.println("ID :" + id + "\t\tGPA :" + gpa);
    }

}
