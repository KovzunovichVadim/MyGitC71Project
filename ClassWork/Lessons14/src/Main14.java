import java.io.*;

public class Main14{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User14 user14 = new User14();

        user14.setId(100);
        user14.setAge(32);
        user14.setName("Vadim");

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\group_71\\test2.txt");
        FileInputStream fileInputStream = new FileInputStream("D:\\group_71\\test2.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(user14);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        User14 user = (User14)inputStream.readObject();
        System.out.println(user);

    }
}
