import java.util.Arrays;
import java.util.Optional;

public class Task18_1 {
    public static void main(String[] args) {
        User user = new User("Vadim");
        Optional <User> myUser = Optional.ofNullable(user);
        if (myUser.isPresent()){
            System.out.println(user.name);
        } else {
            System.out.println("DEFAULT");
        }




    }
}
