import java.util.Arrays;
import java.util.Scanner;

public class TaskHome5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача 1:
        //1.1 Создать двумерный массив, заполнить его случайными числами.

        int[][] arrayTwo = new int[3][5];

        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                arrayTwo[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Массив: " + Arrays.deepToString(arrayTwo));

        //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 0;i<arrayTwo.length;i++){
            for (int j = 0;j<arrayTwo[i].length;j++){
                arrayTwo[i][j] = arrayTwo[i][j] + number;
            }
        }

        System.out.println("Массив: "+Arrays.deepToString(arrayTwo));

        //1.3 Найти сумму всех получившихся элементов и вывести в консоль.

        int summ = 0;
        for (int i = 0;i< arrayTwo.length;i++){
            for (int j = 0;j<arrayTwo[i].length;j++){
                summ = summ + arrayTwo[i][j];
            }
        }

        System.out.println("Сумма чисел массива: " + summ);
    }
}