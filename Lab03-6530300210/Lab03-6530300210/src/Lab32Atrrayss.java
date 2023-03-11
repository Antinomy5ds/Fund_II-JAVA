public class Lab32Atrrayss {
    public static void main(String[] args) {
        int i;
        int[] data = { 30, 20, 15, 0, 9 };

        for (i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("Your data : ");

        for (int j = 0; j <= 4; j++) {
            System.out.printf("data[%d] = %d\n", j, data[j]);
        }
    }

}
