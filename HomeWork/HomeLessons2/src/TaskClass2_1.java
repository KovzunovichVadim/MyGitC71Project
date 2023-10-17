import java.util.Scanner;

public class TaskClass2_1 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 5, 3, 4 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
        }
    }
}
