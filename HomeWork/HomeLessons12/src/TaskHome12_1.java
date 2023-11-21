import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskHome12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        String[] arrText = text.split("\\s*(\\s|,|!|\\.)\\s*");
        boolean check = true;

        Pattern p = Pattern.compile("^[A-ZА-Я]{2,6}");

        for (int i = 0; i < arrText.length; i++) {
            Matcher m = p.matcher(arrText[i]);
            if (m.matches()) {
                System.out.println("Это аббревиатура - " + arrText[i]);
                check = false;
            }
        }

        if (check) {
            System.out.println("В этом тексте нет аббревиатуры от 2 до 6 символов");
        }


    }
}