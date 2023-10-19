import java.util.Arrays;
import java.util.Scanner;

public class TaskHome4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] array = new int[scanner.nextInt()];
        int numberi;
        int numberj;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Массив: "+ Arrays.toString(array));

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            numberj = array[j];
            numberi = array[i];
            array[i] = numberj;
            array[j] = numberi;
        }

        System.out.println("Массив: " + Arrays.toString(array));
    }
}
