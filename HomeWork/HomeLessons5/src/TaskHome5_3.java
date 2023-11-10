import java.util.Arrays;

public class TaskHome5_3 {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        int[][] arrayA = new int[n][m];
        int number = arrayA[0][0];

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                if (i % 2 == 0) {
                    arrayA[i][j] = number;
                } else {
                    arrayA[i][arrayA[i].length - 1 - j] = number;
                }
                number++;
            }
        }

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                if (arrayA[i][j] <= 9){
                    System.out.print(" " + arrayA[i][j] + " ");
                } else {
                    System.out.print(arrayA[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
