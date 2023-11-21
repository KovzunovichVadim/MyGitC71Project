import java.util.Scanner;

public class TaskHome11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrString = new String[3];

        for (int i = 0; i < arrString.length; i++) {
            System.out.print("Введите " + (i + 1) + " строку:");
            arrString[i] = scanner.nextLine();
        }

        int arrMiddleIndex = arrString.length;

        if (arrMiddleIndex % 2 != 0) {
            arrMiddleIndex = arrString.length / 2;
        } else {
            System.out.println("No middle");
        }

        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].length() < arrString[arrMiddleIndex].length()) {
                System.out.println("Строка " + (i + 1) + " : " + arrString[i]);
            }
        }


    }
}
