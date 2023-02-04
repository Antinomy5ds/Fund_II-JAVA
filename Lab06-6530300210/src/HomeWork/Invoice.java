package HomeWork;

import java.util.ArrayList;

public class Invoice {
    private String id;
    private Customer customer;
    private ArrayList<Lineitem> items = new ArrayList<Lineitem>();

    // เซ็ทค่าใบเสร็จ
    public Invoice(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    // นำเข้าสิ้นค้าและจำนวน
    public void addItem(Product product, int quantity) {
        items.add(new Lineitem(product, quantity));
    }

    public String getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Lineitem getLineItem(int i) {
        return items.get(i);
    }

    // ราคาของทั้งหมด
    public double getTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getTotalPrice();
        }
        return total;
    }

    public void print() {
        System.out.println("ITEM:");
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(
                    (i + 1) + "." + "<" + items.get(i).getProduct().getName() + ">" + " x " + "<"
                            + items.get(i).getQuantity()
                            + ">" + " = " + "<" + items.get(i).getTotalPrice() + ">");
        }
    }
}
