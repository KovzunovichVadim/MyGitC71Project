import java.util.Scanner;

public class TaskHome11_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrString = new String[3];
        boolean words = false;

        for (int i = 0; i < arrString.length; i++) {
            System.out.print("Введите " + (i + 1) + " строку:");
            arrString[i] = scanner.nextLine();
        }

        for (int i = 0; i < arrString.length; i++) {
            char[] arr = arrString[i].toCharArray();
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j] == arr[k]) {
                        words = true;
                    } else {
                        words = false;
                    }
                }
            }
            if (words) {
                System.out.println("Первое слово с различными значениями: " + arrString[i]);
                break;
            }
        }
    }
}
