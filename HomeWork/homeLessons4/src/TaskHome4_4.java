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

        //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет.
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count = count + 1;
            }
        }

        System.out.println();
        if (count == 0) {
            System.out.println("Нулевых значении нет!!!");
        } else {
            System.out.println("Количество  нулевых значении: " + count);
        }
    }
}
