import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String email = null;
        String val = " ";
        Optional <String> optional = Optional.of(val);
        Optional <String> optionaln = Optional.ofNullable(email);

        if (optionaln.isPresent()){
            System.out.println(email.charAt(1));
        }

        optionaln.ifPresent(val1 -> System.out.println(val1));

        String result = optionaln.orElse("BAD :(");
        System.out.println(result);
        Boolean result2 = optionaln.filter(val2 -> val2.length()>5).isPresent();
        System.out.println(result2);


    }
}