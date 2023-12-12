import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TaskHome15_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String[] numbers = scanner.next().split(",");
        System.out.println("Enter value: " + Arrays.toString(numbers));
        HashSet<String> set = new HashSet<>(Arrays.asList(numbers));
        System.out.println("New value: " + set);
    }
}
