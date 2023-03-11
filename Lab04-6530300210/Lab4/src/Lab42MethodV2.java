public class Lab42MethodV2 {
    public static void printClassV2(String name, int lenght) {
        for (int i = 0; i < lenght; i++) {
            System.out.print("=");
        }
        System.out.printf(" Class : %s", name);
    }

    public static void main(String[] args) {
        printClassV2("Objects", 15);
    }
}
