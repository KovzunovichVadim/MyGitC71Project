import java.util.Arrays;

public class Main11 {
    public static void main(String[] args) {
        String text = "My lovely c71 group";
        String text2 = "";  // != 0, "" пустой объект

        /*System.out.println(text.length());  // Длина строки
        System.out.println("Hello "+ "world!"); // Создаются три объекта("Hello", "world", "Hello world")
        System.out.println("Hello ".concat("world!!")); // объеденение строк(первая переменная не должна быть null

        // Объеденение строк через специальный класс
        StringJoiner joiner = new StringJoiner(" ","","");
        joiner.add("Red").add("blue").add("Green");
        System.out.println(joiner);

        System.out.print("Разделение строк по символьно: ");
        char[] charArray = text.toCharArray();
        for (char c: charArray){
            System.out.print(c);
            System.out.print(" ");
        }*/

        System.out.println();
        // извлечение символов
        String example = "djafhaiuehfahfadfahpiusefhapsdf";
        System.out.print("Извлечение символа charAt: ");
        System.out.print(example.charAt(0));
        System.out.print(" / Извлечение индекса indexOf: ");
        System.out.print(example.indexOf("f"));

        System.out.println(text);
        System.out.print("Замена символа replace: ");
        text = text.replace("c","C");   // Регулярное выражение " +"(все пробелы между словами
        System.out.print(text);
        System.out.println();

        System.out.print("Обрезка строки trim: ");
        text.trim();
        System.out.print(" удаляет по бокам пробелы и табулляцию.");
        System.out.println();

        System.out.print("Изменение регистра toLowerCase(Hello): ");
        System.out.print("Hello".toLowerCase());
        System.out.println();
        System.out.print("Изменение регистра toUpperCase(Hello): ");
        System.out.print("Hello".toUpperCase());
        System.out.println();

        System.out.print("Разбиение строки split: ");
        String data = "1|Vadim|Ivanov|34|true";

        String resultArray[] = data.split("\\|");
        System.out.print(Arrays.toString(resultArray));
        System.out.println(resultArray[2]);

        System.out.print("Проверка на пустоту isEmpty(пробел тоже символ): ");
        String line =" ";
        System.out.print(line.isEmpty());
        System.out.println();
        System.out.print("Проверка на пустоту isBlank(пробел не считается за символ): ");
        System.out.print(line.isBlank());
        System.out.println();

        System.out.print("Получение части строки substring: ");
        String data2 = "1|Vadim|Ivanov     |34|true";
        System.out.print(data2.substring(8,19).trim());
        System.out.println();

        System.out.print("Сравнение строк equals");
        System.out.println("ABD".equals("ABC"));
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println("abc".compareToIgnoreCase("ABC"));
        System.out.println("ABD".compareTo("ABC"));


    }
}