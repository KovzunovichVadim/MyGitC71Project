import java.util.Scanner;

public class TaskHome4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] arrayNumber = new int[scanner.nextInt()];

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print("Введите число" + (i + 1) + ": ");
            arrayNumber[i] = scanner.nextInt();
        }
        System.out.print("Массив числа: ");
        for (int i = 0;i<arrayNumber.length;i++){
            System.out.print(arrayNumber[i]+" ");
        }
    }
}
