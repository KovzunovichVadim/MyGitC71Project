import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task14_2_Writer_Reader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String ourResult = scanner.nextLine();
        String ourResult2 = "";

        try (FileReader fileReader = new FileReader("D:\\group_71\\test.txt");
             FileWriter fileWriter = new FileWriter("D:\\group_71\\test.txt")) {
            fileWriter.write(ourResult);
            fileWriter.flush();
            int i;
            while ((i = fileReader.read()) != -1) {
                ourResult2 = ourResult2 + ((char) i);
            }
            System.out.println(ourResult2.replaceAll(" ", "_"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
