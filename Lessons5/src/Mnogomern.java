import java.util.Arrays;

public class Mnogomern {
    public static void main(String[] args) {
        //int[] array = new int[5];

        //int[][] secondArray = new int[5][2]; // 1 - строки, 2 - столбцы

        // Обходить

        // 1 for обходит строки
        // 2 for обходит столбцы

        /*for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }*/

        /* Печатать всего массива

        System.out.println(Arrays.deepToString(secondArray)); */

        // Зубчатые массивы
        // 1 2 3
        // 4 5
        // 6 7 8 9

        /*int[][] arrayZub = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        for (int i = 0; i < arrayZub.length; i++) {
            for (int j = 0; j < arrayZub[i].length; j++) {
                System.out.print(arrayZub[i][j] + " ");
            }
            System.out.println();
        }*/

        /*int[][] b =new int[5][];
        b[0] = new  int[1];
        b[1] = new  int[2];
        b[2] = new  int[3];
        b[3] = new  int[4];
        b[4] = new  int[5];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }*/

    }
}
