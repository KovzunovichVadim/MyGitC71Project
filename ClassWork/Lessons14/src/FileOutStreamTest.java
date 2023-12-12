import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest {
    public static void main(String[] args) {
            String ourResult = "save me please";

            try (FileOutputStream fileOutputStream = new FileOutputStream("D:\\group_71\\test.txt",true)) {
                byte[] resultByte = ourResult.getBytes();
                fileOutputStream.write(resultByte);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

