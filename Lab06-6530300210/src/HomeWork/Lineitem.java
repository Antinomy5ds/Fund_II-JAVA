package HomeWork;

public class Lineitem {
    private Product item = new Product();
    private int quantity;

    // เช็ทจำนวนของและจำนวนสินค้า
    public Lineitem(Product product, int quantity) {
        this.item = product;
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    // แสดงชื่อสินค้า
    public Product getProduct() {
        return this.item;
    }

    // แสดงปริมาณสินค้า
    public int getQuantity() {
        return this.quantity;
    }

    public double getTotalPrice() {
        return getQuantity() * item.getPrice();
    }
}
