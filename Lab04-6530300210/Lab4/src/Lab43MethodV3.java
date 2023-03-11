public class Lab43MethodV3 {
    public static void drawSquare(char c, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(c + "   ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        drawSquare('*', 5);
    }
}
