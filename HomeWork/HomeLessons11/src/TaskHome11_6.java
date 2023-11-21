import java.util.Arrays;
import java.util.Scanner;

public class TaskHome11_6 {
    public static void main(String[] args) {
        String text = ("Это слово палиндром - топот");
        String[] arrText = text.split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(arrText.length);

        if (number >= arrText.length) {
            System.out.println("Число слов меньше: " + number);
        } else if (arrText[number].length() == 1) {
            System.out.println("Это не полиндром - " + arrText[number]);
        } else {
            StringBuilder sb = new StringBuilder(arrText[number]);
            String words = String.valueOf(sb.reverse());
            if (arrText[number].compareTo(words) == 0) {
                System.out.println("Это полиндром - " + sb + "!");
            } else {
                System.out.println("Это не полиндром - " + arrText[number]);
            }
        }
    }
}
