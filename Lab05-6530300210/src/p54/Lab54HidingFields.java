package p54;

public class Lab54HidingFields {
    public static void main(String[] args) {
        Ap x = new Bp();
        System.out.println("(1)     x.i is " + x.i);
        System.out.println("(2)  (B)x.i is " + ((Bp) x).i);

        System.out.println("(2)     x.i is " + x.j);
        System.out.println("(3)  (B)x.j is " + ((Bp) x).j);

        System.out.println("(5)     x.m1() is " + x.m1());
        System.out.println("(6)  (B)x.m1() is: " + ((Bp) x).m1());

        System.out.println("(7)     x.m2() is " + x.m2());
        System.out.println("(8)     x.n3() is " + x.m3());

    }
}
