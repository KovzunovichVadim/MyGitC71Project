import java.io.File;

public class FilePath {
    public static void main(String[] args) {
        File file = new File("D:\\group_71", "test.txt");

        System.out.println(file.getPath());
    }
}
