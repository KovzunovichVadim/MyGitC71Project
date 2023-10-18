import java.util.Scanner;

public class TaskHome4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");

        int[] arraysNumbers = new int[scanner.nextInt()];


        for (int i = 0; i < arraysNumbers.length; i++) {
            arraysNumbers[i] = (int) (Math.random() * 10);
            if (i == 0) {
                System.out.print("Массив числа: ");
            }
            System.out.print(arraysNumbers[i] + " ");
        }

        int max = arraysNumbers[0];
        int min = arraysNumbers[0];

        for (int i = 1; i < arraysNumbers.length; i++) {
            if (max < arraysNumbers[i]) {
                max = arraysNumbers[i];
            }
        }

        for (int i = 1; i < arraysNumbers.length; i++) {
            if (min > arraysNumbers[i]) {
                min = arraysNumbers[i];
            }
        }

        System.out.println("");
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное  число: " + min);

    }
}
