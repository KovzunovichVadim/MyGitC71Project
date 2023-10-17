import java.util.Scanner;

public class TaskHome2_5 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                for (int i = 1; n >= i; ++i) {
                    summ +=i;
                }
                System.out.println("Сумма чисел: " + summ);
            }
        } else {
            System.out.println("Неверное значение");
        }
    }
}
