import java.util.Scanner;

public class ErrorException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(100 / scanner.nextInt());
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }


        System.out.println("End");
    }
}