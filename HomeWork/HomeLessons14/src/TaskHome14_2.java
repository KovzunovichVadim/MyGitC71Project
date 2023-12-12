import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TaskHome14_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int checkDocumentLength = 15;
        int i;
        String validDocument = "";
        String notValidDocument = "";
        System.out.print("Enter file path: ");
        String filePath = scanner.next();
        System.out.println(filePath);

        try (FileReader fr = new FileReader(filePath);
             FileWriter fwValid = new FileWriter("D:\\JavaTest\\Valid number.txt", true);
             FileWriter fwNotValid = new FileWriter("D:\\JavaTest\\Not valid number.txt", true)) {
            while ((i = fr.read()) != -1) {
                sb.append((char) i);
            }
            String[] arrayDocument = sb.toString().split("\\r\\n");
            System.out.println(Arrays.toString(arrayDocument));
            for (String document : arrayDocument) {
                if (document.matches("^D?d?ocnum\\w{9}$") || document.matches("C?c?ontract\\w{7}")) {
                    validDocument = document + "\n";
                    fwValid.write(validDocument);
                } else {
                    if (document.startsWith("docnum") || document.startsWith("contract")) {
                        notValidDocument = document + " - wrong format\n";
                        fwNotValid.write(notValidDocument);
                    } else if (document.startsWith("Docnum") || document.startsWith("Contract")) {
                        notValidDocument = document + " - wrong format\n";
                        fwNotValid.write(notValidDocument);
                    } else {
                        notValidDocument = document + " - wrong format(must begin from docnum or contract\n";
                        fwNotValid.write(notValidDocument);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
