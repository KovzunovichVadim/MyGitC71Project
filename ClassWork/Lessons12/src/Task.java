import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {


    public static void main(String[] args) {

        // Pattern для создания и хранения шаблона(regex, pattern)
        // Matcher движок(шаблон и строка) -> результат

        // 1. Написать метод который сможет вернуть все цифры из строки:
        Pattern pattern1 = Pattern.compile("[0-9]{7}");
        Matcher matcher1 = pattern1.matcher("My number is 9379991");

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

        // 2. Написать метод который сможет заменить КАЖДУЮ букву на знак &
        Pattern pattern2 = Pattern.compile("[A-z]");
        Matcher matcher2 = pattern2.matcher("Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills”.");
        String result = matcher2.replaceAll("&");
        System.out.println(result);

        // 3. Написать метод который сможет вернуть инсту
        Pattern pattern3 = Pattern.compile("@[A-z]+");
        Matcher matcher3 = pattern3.matcher("Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills”.");

        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }

        // 4. Написать метод который возвращает true если строка имеет вид “null”
        Pattern pattern4 = Pattern.compile("null");
        String input = "null";
        Matcher matcher4 = pattern4.matcher(input);
        System.out.println(matcher4.matches());

        // 5. В строке “Hello \n world \n !!!” заменить \n на “” используя классы Pattern и Matcher.
        String input5 = "Hello \n world \n !!!";
        System.out.println(input5);
        Pattern pattern5 = Pattern.compile("\n");
        Matcher matcher5 = pattern5.matcher(input5);
        String result5 = matcher5.replaceAll("");
        System.out.println(result5);

        // 6. В строке “Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!” найти имя и фамилию человека и вывести на экран!
        String input6 = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
        Pattern pattern6 = Pattern.compile("[А-Я][а-я]+ [А-Я][а-я]+");
        Matcher matcher6 = pattern6.matcher(input6);

        while (matcher6.find()) {
            System.out.println(matcher6.group());
        }
    }
}
