package Lab77;

public class Dog {
    private String name;

    public Dog() {
        this.name = null;
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String color) {
        this.name = color;
    }

    public void bark() {
        System.out.println("Woof Woof");
    }
}
