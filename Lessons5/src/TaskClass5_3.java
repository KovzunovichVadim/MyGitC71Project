import java.util.Random;

public class TaskClass5_3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();
        int summ = 0;
        int summ2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1, 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0, j = 0; i < array.length & j < array.length; i++, j++) {
            summ = summ + array[i][j];
        }
        System.out.println(summ);

        for (int i = 0; i< array.length;i++){
            summ2 = summ2 + array[i][array.length-1-i];

        }

        System.out.println(summ2);

    }
}
