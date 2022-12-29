public class Lab32Arrays {
    public static void main(String[] args) {
        float[] score = new float[] { 80.2f, 67.5f, 70.0f, 68.5f, 82.7f, 55.5f, 78.8f };
        float sum = 0;
        int score_length = score.length;

        for (int i = 0; i < score_length; i++) {
            sum = sum + score[i];
            System.out.printf("Score [%d] = %.2f : Sum = %.2f\n", i, score[i], sum);
        }
        System.out.printf("Average : %.2f", (sum / score_length));
    }
}
