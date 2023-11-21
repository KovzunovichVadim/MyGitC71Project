import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class TaskHome11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrString = new String[3];

        for (int i = 0; i < arrString.length; i++) {
            System.out.print("Введите " + (i + 1) + " строку:");
            arrString[i] = scanner.nextLine();
        }

        for (int i = 0; i < arrString.length; i++) {
            for (int j = i + 1; j < arrString.length; j++) {
                if (arrString[i].length() > arrString[j].length()) {
                    String n = arrString[i];
                    arrString[i] = arrString[j];
                    arrString[j] = n;
                }
            }
        }
        System.out.println(Arrays.toString(arrString));
    }
}
