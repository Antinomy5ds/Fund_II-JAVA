package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Invoice> invoices = new ArrayList<>();

        // นำเข้าข้อมูลสินค้า
        products.add(new Product("99", "DOLAN DF4 CARBON", 80000));
        products.add(new Product("01", "Giro Switchblade", 9200));
        products.add(new Product("22", "Soild Drawstring Hood", 540));
        products.add(new Product("54", "Passione Adventure Glove", 900));
        products.add(new Product("59", "Passione Knitted Shoe", 450));
        products.add(new Product("65", "Passione Knitted Glove", 450));
        products.add(new Product("45", "Passione Knitted Shirt", 500));
        products.add(new Product("78", "Passione Knitted Skirt", 400));
        products.add(new Product("78", "Passione Bag", 800));
        products.add(new Product("78", "Passione Suitcase", 2000));
        products.add(new Product("78", "Passione Knife", 200));

        // รับข้อมูลลูกค้า
        System.out.print("Enter number of customers: ");
        int numCustomers = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numCustomers; i++) {
            System.out.println("\nCustomer NO." + (i + 1));
            System.out.print("Enter a ID: ");
            String id = sc.nextLine();
            System.out.print("Enter a First Name: ");
            String firstName = sc.nextLine();
            System.out.print("Enter a Last Name: ");
            String lastName = sc.nextLine();
            System.out.print("Enter a Invoice ID: ");
            String invoiceId = sc.nextLine();

            // สร้างใบเสร็จ
            Customer customer = new Customer(id, firstName, lastName);
            Invoice invoice = new Invoice(invoiceId, customer);
            customers.add(customer);
            invoices.add(invoice);

        }
        for (int i = 0; i < invoices.size(); i++) {
            int typeitem = rd.nextInt(3, 8);

            for (int j = 0; j < typeitem; j++) {
                {

                    int item = rd.nextInt(0, 11);
                    invoices.get(i).addItem(products.get(item), rd.nextInt(1, 3));

                }
            }

        }
        for (int i = 0; i < invoices.size(); i++) {
            System.out.println("INOVICE: " + "#" + "<" + invoices.get(i).getId() + ">");
            System.out.println(
                    "CUSTOMER: " + "<" + customers.get(i).getFirstName() + " " + customers.get(i).getLastName() + "> ");
            invoices.get(i).print();
            System.out.println("TOTAL: " + invoices.get(i).getTotalPrice());
        }
    }
}
