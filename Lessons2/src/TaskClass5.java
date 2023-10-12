import java.util.Scanner;

public class TaskClass5 {
    public static void main(String[] args) {
        //Пользователь вводит число, распечатать все делители этого числа

        //20
        //2,4,5,10,20

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();

        for (int i = num; i > 0; i--) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
