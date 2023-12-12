import java.io.*;

public class TaskHome14_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String wordMax = "";
        int wordLength = 0;
        int i;
        try (FileReader fr = new FileReader("D:\\JavaTest\\romeo-and-juliet.txt");
             FileWriter fw = new FileWriter("D:\\JavaTest\\WordMax.txt")) {
            while ((i = fr.read()) != -1) {
                sb.append((char) i);
            }
            String[] arraySb = sb.toString().split("\\W");

            for (i = 0; i < arraySb.length; i++) {
                if (wordLength < arraySb[i].length()) {
                    wordLength = arraySb[i].length();
                    wordMax = arraySb[i];
                }
            }
            fw.write(wordMax);
            System.out.println(wordMax);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}