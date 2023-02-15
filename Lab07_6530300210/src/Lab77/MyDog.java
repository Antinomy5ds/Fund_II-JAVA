package Lab77;

public class MyDog extends Dog implements CanSwim, CanFetch {
    public MyDog(String name) {
        super(name);
    }

    public void Swim() {
        System.out.printf("%s is swimming. \n", super.getName());
    }

    public void fetch() {
        System.out.printf("%s is fetching. \n", super.getName());
    }
}
