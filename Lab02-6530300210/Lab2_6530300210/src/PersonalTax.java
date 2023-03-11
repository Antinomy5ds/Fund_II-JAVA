import java.util.*;

public class PersonalTax {
        public static void main(String[] args) {
                int salary, yearCost, taxDeduction, income, total;
                String other;
                Scanner sc = new Scanner(System.in);
                Scanner sc_come = new Scanner(System.in);
                double tax1, tax2, tax3, tax4, tax5, tax6, tax7, tax;
                tax = 150000 * 0.05;
                double tax10 = 200000 * 0.1;
                double tax15 = 250000 * 0.15;
                double tax20 = 250000 * 0.2;
                double tax25 = 1000000 * 0.25;
                double tax30 = 3000000 * 0.3;

                System.out.print("Enter Salary: ");
                salary = sc.nextInt();
                System.out.print("Enter Year cost: ");
                yearCost = sc.nextInt();
                System.out.print("Enter Tax deduction: ");
                taxDeduction = sc.nextInt();

                System.out.print("You have other income? ");
                other = sc_come.nextLine();
                char in = other.charAt(0);

                if (in == 'Y') {
                        System.out.print("Input other income: ");
                        income = sc.nextInt();
                        total = (salary * 12) - yearCost - taxDeduction + income;

                        System.out.println(
                                        "Income : " + "(" + salary + " x 12" + ")" + " - " + yearCost + " - "
                                                        + taxDeduction
                                                        + "+" + income
                                                        + " = " + total);
                        if (total <= 150000) {
                                System.out.println("Tax is 0%");
                                System.out.print("Your Tax = Free Tax");
                        } else if (total > 150000 && total < 300000) {
                                tax1 = (total - 150000) * 0.05;
                                System.out.println("Tax is 5%");

                                System.out.println("Cal Tax " + total + " - " + "150000" + " = " + (total - 150000)
                                                + " * " + " 5%"
                                                + " = " + tax1 + " BTH");
                                System.out.println("Your Tax is " + tax1 + " BTH");
                        } else if (total > 300000 && total < 500000) {
                                tax2 = (total - 300000) * 0.1;
                                System.out.println("Tax is 10%");

                                System.out.println("\nStep2\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "150000" + " = " + (total - 300000) + " * " + " 10 %" + " = "
                                                + (int) tax2 + " BTH");
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = " + (int) (tax + tax2));
                        } else if (total > 500000 && total < 750000) {
                                tax3 = (total - 500000) * 0.15;
                                System.out.println("Tax is 15%");
                                System.out.println("\nStep3\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "150000" + " = " + (total - 300000) + " - " + " 200000 " + " = "
                                                + (total - 500000) + " * "
                                                + " 15 %" + " = " + (int) tax3 + " BTH");
                                System.out.println("Step2\nCal Tax 200000 * 10% = " + (int) tax10);
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = " + (int) (tax + tax + tax3));

                        } else if (total > 750000 && total < 1000000) {
                                tax4 = (total - 750000) * 0.2;
                                System.out.println("Tax is 20%");
                                System.out.println("\nStep4\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "150000" + " = " + (total - 300000) + " - " + " 200000 " + " = "
                                                + (total - 500000) + " - "
                                                + "250000" + " = " + (total - 750000) + " * " + " 20 %" + " = "
                                                + (int) tax4 + " BTH");
                                System.out.println("Step3\nCal Tax 250000 * 15% = " + (int) tax15);
                                System.out.println("Step2\nCal Tax 200000 * 10% = " + (int) tax10);
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = " + (int) (tax + tax10 + tax15 + tax4));

                        } else if (total > 1000000 && total < 2000000) {
                                tax5 = (total - 1000000) * 0.25;
                                System.out.println("Tax is 25%");
                                System.out.println("\nStep5\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "150000" + " = " + (total - 300000) + " - " + " 200000 " + " = "
                                                + (total - 500000) + " - "
                                                + "250000" + " = " + (total - 750000) + " - 250000" + " = "
                                                + (total - 1000000)
                                                + " * " + " 25 %" + " = " + (int) tax5 + " BTH");
                                System.out.println("Step4\nCal Tax 250000 * 20% = " + (int) tax20);
                                System.out.println("Step3\nCal Tax 250000 * 15% = " + (int) tax15);
                                System.out.println("Step2\nCal Tax 200000 * 10% = " + (int) tax10);
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = " + (int) (tax + tax10 + tax15 + tax20 + tax5));
                        } else if (total > 2000000 && total < 5000000) {
                                tax6 = (total - 2000000) * 0.3;
                                System.out.println("Tax is 30%");
                                System.out.println("\nStep5\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "300000" + " = " + (total - 300000) + " - " + " 500000 " + " = "
                                                + (total - 500000) + " - "
                                                + "750000" + " = " + (total - 750000) + " = " + (total - 1000000)
                                                + " - 1000000 " + " = " + (total - 2000000) + " * " + " 30 %" + " = "
                                                + (int) tax6 + " BTH");
                                System.out.println("Step5\nCal Tax 1000000 * 25% = " + (int) tax25);
                                System.out.println("Step4\nCal Tax 250000 * 20% = " + (int) tax20);
                                System.out.println("Step3\nCal Tax 250000 * 15% = " + (int) tax15);
                                System.out.println("Step2\nCal Tax 200000 * 10% = " + (int) tax10);
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = " + (int) (tax + tax10 + tax15 + tax20 + tax25 + tax6));
                        } else {
                                tax7 = (total - 5000000) * 0.35;
                                System.out.println("Tax is 30%");
                                System.out.println("\nStep7\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "150000" + " = " + (total - 300000) + " - " + " 200000 " + " = "
                                                + (total - 500000) + " - "
                                                + "250000" + " = " + (total - 750000) + " - 250000" + " = "
                                                + (total - 1000000) + " - 1000000" + " = " + (total - 2000000)
                                                + " - " + "3000000" + " = " + (total - 5000000) + " * " + " 35 %"
                                                + " = " + (int) tax7 + " BTH");
                                System.out.println("Step6\nCal Tax 3000000 * 30% = " + (int) tax30);
                                System.out.println("Step5\nCal Tax 1000000 * 25% = " + (int) tax25);
                                System.out.println("Step4\nCal Tax 250000 * 20% = " + (int) tax20);
                                System.out.println("Step3\nCal Tax 250000 * 15% = " + (int) tax15);
                                System.out.println("Step2\nCal Tax 200000 * 10% = " + (int) tax10);
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = "
                                                + (int) (tax + tax10 + tax15 + tax20 + tax25 + tax30 + tax7));
                        }
                } else {
                        total = (salary * 12) - yearCost - taxDeduction;
                        System.out.println("Income : " + "(" + salary + "x12" + ")" + "-" + yearCost + "-"
                                        + taxDeduction + "+" + " = " + total);
                        if (total <= 150000) {
                                System.out.println("Tax is 0%");
                                System.out.print("Your Tax = Free Tax");
                        } else if (total > 150000 && total < 300000) {
                                tax1 = (total - 150000) * 0.05;
                                System.out.println("Tax is 5%");

                                System.out.println("Cal Tax " + total + " - " + "150000" + " = " + (total - 150000)
                                                + " * " + " 5%"
                                                + " = " + tax1);
                                System.out.println("Your Tax is " + tax1 + " BTH");
                        } else if (total > 300000 && total < 500000) {
                                tax2 = (total - 300000) * 0.1;
                                System.out.println("Tax is 10%");

                                System.out.println("\nStep2\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "150000" + " = " + (total - 300000) + " * " + " 10 %" + " = "
                                                + (int) tax2 + " BTH");
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = " + (int) (tax + tax2));
                        } else if (total > 500000 && total < 750000) {
                                tax3 = (total - 500000) * 0.15;
                                System.out.println("Tax is 15%");
                                System.out.println("\nStep3\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "150000" + " = " + (total - 300000) + " - " + " 200000 " + " = "
                                                + (total - 500000) + " * "
                                                + " 15 %" + " = " + (int) tax3 + " BTH");
                                System.out.println("Step2\nCal Tax 200000 * 10% = " + (int) tax10);
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = " + (int) (tax + tax + tax3));

                        } else if (total > 750000 && total < 1000000) {
                                tax4 = (total - 750000) * 0.2;
                                System.out.println("Tax is 20%");
                                System.out.println("\nStep4\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "150000" + " = " + (total - 300000) + " - " + " 200000 " + " = "
                                                + (total - 500000) + " - "
                                                + "250000" + " = " + (total - 750000) + " * " + " 20 %" + " = "
                                                + (int) tax4 + " BTH");
                                System.out.println("Step3\nCal Tax 250000 * 15% = " + (int) tax15);
                                System.out.println("Step2\nCal Tax 200000 * 10% = " + (int) tax10);
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = " + (int) (tax + tax10 + tax15 + tax4));

                        } else if (total > 1000000 && total < 2000000) {
                                tax5 = (total - 1000000) * 0.25;
                                System.out.println("Tax is 25%");
                                System.out.println("\nStep5\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "150000" + " = " + (total - 300000) + " - " + " 200000 " + " = "
                                                + (total - 500000) + " - "
                                                + "250000" + " = " + (total - 750000) + " - 250000" + " = "
                                                + (total - 1000000)
                                                + " * " + " 25 %" + " = " + (int) tax5 + " BTH");
                                System.out.println("Step4\nCal Tax 250000 * 20% = " + (int) tax20);
                                System.out.println("Step3\nCal Tax 250000 * 15% = " + (int) tax15);
                                System.out.println("Step2\nCal Tax 200000 * 10% = " + (int) tax10);
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = " + (int) (tax + tax10 + tax15 + tax20 + tax5));
                        } else if (total > 2000000 && total < 5000000) {
                                tax6 = (total - 2000000) * 0.3;
                                System.out.println("Tax is 30%");
                                System.out.println("\nStep5\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "300000" + " = " + (total - 300000) + " - " + " 500000 " + " = "
                                                + (total - 500000) + " - "
                                                + "750000" + " = " + (total - 750000) + " = " + (total - 1000000)
                                                + " - 1000000 " + " = " + (total - 2000000) + " * " + " 30 %" + " = "
                                                + (int) tax6 + " BTH");
                                System.out.println("Step5\nCal Tax 1000000 * 25% = " + (int) tax25);
                                System.out.println("Step4\nCal Tax 250000 * 20% = " + (int) tax20);
                                System.out.println("Step3\nCal Tax 250000 * 15% = " + (int) tax15);
                                System.out.println("Step2\nCal Tax 200000 * 10% = " + (int) tax10);
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = " + (int) (tax + tax10 + tax15 + tax20 + tax25 + tax6));
                        } else {
                                tax7 = (total - 5000000) * 0.35;
                                System.out.println("Tax is 30%");
                                System.out.println("\nStep7\nCal Tax " + total + " - " + "150000" + " = "
                                                + (total - 150000) + " - "
                                                + "150000" + " = " + (total - 300000) + " - " + " 200000 " + " = "
                                                + (total - 500000) + " - "
                                                + "250000" + " = " + (total - 750000) + " - 250000" + " = "
                                                + (total - 1000000) + " - 1000000" + " = " + (total - 2000000)
                                                + " - " + "3000000" + " = " + (total - 5000000) + " * " + " 35 %"
                                                + " = " + (int) tax7 + " BTH");
                                System.out.println("Step6\nCal Tax 3000000 * 30% = " + (int) tax30);
                                System.out.println("Step5\nCal Tax 1000000 * 25% = " + (int) tax25);
                                System.out.println("Step4\nCal Tax 250000 * 20% = " + (int) tax20);
                                System.out.println("Step3\nCal Tax 250000 * 15% = " + (int) tax15);
                                System.out.println("Step2\nCal Tax 200000 * 10% = " + (int) tax10);
                                System.out.println("Step1\nCal Tax 150000 * 5% = " + (int) tax);
                                System.out.println("Your Tax = "
                                                + (int) (tax + tax10 + tax15 + tax20 + tax25 + tax30 + tax7) + " BTH");
                                sc_come.close();
                                sc.close();
                        }
                }
        }
}
