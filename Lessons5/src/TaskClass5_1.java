import java.util.Random;

public class TaskClass5_1 {
    public static void main(String[] args) {
        //Создайте двумерный массив
        // заполните его псевдослучайными числами с помощью класса Random
        // Найдите максимальное значение в созданном 2-мерном массиве
        //System.out.println(random.nextInt(-10,10));

        Random random = new Random();
        int[][] array = new int[3][3];
        int tempMax = Integer.MIN_VALUE;
        String max = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1, 100);
                System.out.print(array[i][j] + " ");
                if (array[i][j] > tempMax) {
                    tempMax = array[i][j];
                    max = "[" + i + "]" + "[" + j + "]";
                }
            }
            System.out.println();

        }

        System.out.println(max);

    }
}
