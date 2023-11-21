import java.util.Scanner;

public class TaskHome11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrString = new String[3];
        for (int i = 0; i < arrString.length; i++) {
            System.out.print("Введите " + (i + 1) + " строку:");
            arrString[i] = scanner.nextLine();
        }
        String nMin = arrString[0];
        int nLengthMin = arrString[0].length();
        String nMax = arrString[0];
        int nLengthMax = arrString[0].length();

        for (int i = 1; i < arrString.length; i++) {
            if (nLengthMin > arrString[i].length()) {
                nLengthMin = arrString[i].length();
                nMin = arrString[i];
            }

            if (nLengthMax < arrString[i].length()) {
                nLengthMax = arrString[i].length();
                nMax = arrString[i];
            }

        }

        System.out.println("Самая длинная строка: " + nMax + " = " + nLengthMax);
        System.out.println("Самая короткая строка: " + nMin + " = " + nLengthMin);

    }
}