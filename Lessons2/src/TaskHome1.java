import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TaskHome1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Это четное число: " + n);
        } else {
            System.out.println("Это нечетное число: " + n);
        }
    }
}
