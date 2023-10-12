import java.util.Scanner;

public class PrimerScanner {
    public static void main(String[] args) {
        //Задача: 1.ввести данные из клавиатуры
        //Создание сканера
        Scanner scanner = new Scanner(System.in);

        //2. Вводим верную команду
        int ourvalue = scanner.nextInt();

        //3. Использование переменнной
        System.out.println("Your value: " + ourvalue);




    }
}
