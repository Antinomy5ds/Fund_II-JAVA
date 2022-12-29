public class Lab36MutiArrays {
    public static void main(String[] args) {
        int matrix[][] = {
                { 90, 5, 12, -2 }, { -8, 15, -7, 52 }, { 0, 23, -8, 1 }
        };
        System.out.println("Matrix A is ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
