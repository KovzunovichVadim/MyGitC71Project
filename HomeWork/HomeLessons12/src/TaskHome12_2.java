import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskHome12_2 {
    public static void main(String[] args) {
        String text = "Программа на вход получает произвольный текст Text. Программа на вход получает произвольный текст 1423-1512-51. 1423-1512-51. емейл teachmeskills@gmail.com и номер телефона +(29)1234567";
        Pattern patternDocument = Pattern.compile("(\\d{4}-){2}\\d{2}");
        Pattern patternEmail = Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}", Pattern.CASE_INSENSITIVE);
        Pattern patternPhone = Pattern.compile("\\+(\\(\\d{2}\\))\\d{7}");

        Matcher matcherDocument = patternDocument.matcher(text);
        Matcher matcherEmail = patternEmail.matcher(text);
        Matcher matcherPhone = patternPhone.matcher(text);

        while (matcherDocument.find()) {
            System.out.println("Document number: " + matcherDocument.group());
        }


        while (matcherEmail.find()) {
            System.out.println("Email: " + matcherEmail.group());
        }

        while (matcherPhone.find()) {
            System.out.println("Phone number: " + matcherPhone.group());
        }
    }
}
