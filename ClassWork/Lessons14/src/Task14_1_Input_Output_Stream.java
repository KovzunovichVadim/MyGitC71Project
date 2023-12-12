import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task14_1_Input_Output_Stream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String ourResult = scanner.nextLine();
        String ourResult2 = "";

        try (FileOutputStream fileOutputStream = new FileOutputStream("D:\\group_71\\test.txt", true);
             FileInputStream fileInputStream = new FileInputStream("D:\\group_71\\test.txt")) {
            byte[] reusltByte = ourResult.getBytes();
            fileOutputStream.write(reusltByte);
            int i;
            while ((i = fileInputStream.read()) != -1) {
                ourResult2 = ourResult2 + ((char) i);
            }
            System.out.println(ourResult2.replaceAll(" ", "_"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
