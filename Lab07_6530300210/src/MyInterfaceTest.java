public class MyInterfaceTest {
    public static void main(String[] args) {
        Lab71 i = new Lab71();
        Lab72 j = new Lab72();

        i.m1();
        j.m1();

        Lab74 k = new Lab74() {
            
        };
        k.m1();
        k.m2();

        Lab75 l = new Lab75() { //
            public void m1() {
                super.m2();

            }
        };
        l.m2();
        Lab76 x = new Lab76() {

        };
        x.m1();
    }
}
