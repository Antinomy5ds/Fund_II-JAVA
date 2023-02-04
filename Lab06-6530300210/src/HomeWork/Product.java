package HomeWork;

public class Product {
    private String id, name;
    private double price;

    public Product() {

    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        if (price < 0) {
            this.price = 0.0;
        } else
            this.price = price;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else
            this.price = price;
    }

    double getPrice() {
        return this.price;
    }
}
