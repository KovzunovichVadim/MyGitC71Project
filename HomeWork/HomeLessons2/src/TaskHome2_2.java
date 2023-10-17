import java.util.Scanner;

public class TaskHome2_2 {
    public static void main(String[] args) {
        System.out.println("Температура: ");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 & t > -20) {
            System.out.println("Normal");
        } else if (t <= -20) {
            System.out.println("Cold");
        }
    }
}
