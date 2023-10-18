import java.util.Scanner;

public class TaskHome4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (i == 0) {
                System.out.print("Массив числа: ");
            }
            System.out.print(array[i] + " ");
        }
    }
}
