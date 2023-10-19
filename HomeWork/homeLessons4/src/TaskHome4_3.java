import java.util.Scanner;

public class TaskHome4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] arraysNumbers = new int[scanner.nextInt()];
        System.out.print("Массив числа: ");

        for (int i = 0; i < arraysNumbers.length; i++) {
            arraysNumbers[i] = (int) (Math.random() * 10);
            System.out.print(arraysNumbers[i] + " ");
        }

        int max = arraysNumbers[0];
        int min = arraysNumbers[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < arraysNumbers.length; i++) {
            if (max < arraysNumbers[i]) {
                max = arraysNumbers[i];
                maxIndex = i;
            }
        }

        for (int i = 1; i < arraysNumbers.length; i++) {
            if (min > arraysNumbers[i]) {
                min = arraysNumbers[i];
                minIndex = i;
            }
        }

        System.out.println("");
        System.out.println("Максимальный индекс: " + maxIndex);
        System.out.println("Минимальный  индекс: " + minIndex);
    }
}

