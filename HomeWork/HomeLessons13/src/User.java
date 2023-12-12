import javax.security.auth.login.LoginException;
import java.rmi.MarshalException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private static final String LOGINCORRECT = "Login is correct";
    private static final String LOGINLENGTH = "Login length can't be more then 20 symbol";
    private static boolean loginLengthCheck = false;
    private static final String LOGINSPACE = "Login can't contain symbol 'space'";
    private static boolean loginSpaceCheck = false;
    private static final String LOGINNUMBER = "Login must contains at least one number";
    private static boolean loginNumberCheck = true;
    private static final String PASSWORDCORRECT = "Password is correct";
    private static final String PASSWORDLENGTH = "Password length can't be more then 20 symbol";
    private static boolean passwordLengthCheck = false;
    private static final String PASSWORDSPACE = "Password can't contain symbol 'space'";
    private static boolean passwordSpaceCheck = false;
    private static final String PASSWORDNUMBER = "Password must contains at least one number";
    private static boolean passwordNumberCheck = true;
    private static final String PASSWORDEQUALS = "Password and Confirm password not equals";
    private static boolean passwordEqualsCheck = false;

    static void validation(String loginCheck, String passwordCheck, String confirmPasswordCheck) throws WrongLoginException, WrongPasswordException {
        validationLogin(loginCheck);
        validationPassword(passwordCheck,confirmPasswordCheck);
    }

    static void validationLogin(String login) throws WrongLoginException {
        if (login.length() > 20) {
            loginLengthCheck = true;
        }

        if (login.contains(" ")) {
            loginSpaceCheck = true;
        }

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(login);

        if (matcher.find()) {
            loginNumberCheck = false;
        }

        if (loginLengthCheck || loginSpaceCheck || loginNumberCheck) {
            if (loginLengthCheck) {
                try {
                    throw new WrongLoginException(LOGINLENGTH);
                } catch (WrongLoginException e) {
                    e.printStackTrace();
                }
            }

            if (loginSpaceCheck) {
                try {
                    throw new WrongLoginException(LOGINSPACE);
                } catch (WrongLoginException e) {
                    e.printStackTrace();
                }
            }

            if (loginNumberCheck) {
                try {
                    throw new WrongLoginException(LOGINNUMBER);
                } catch (WrongLoginException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println(LOGINCORRECT);
        }
    }

    static void validationPassword(String password, String confirmPassword) throws WrongPasswordException {
            if (password.length() > 20) {
                passwordLengthCheck = true;
            }

            if (password.contains(" ")) {
                passwordSpaceCheck = true;
            }

            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()) {
                passwordNumberCheck = false;
            }

            if (password != confirmPassword) {
                passwordEqualsCheck = true;
            }

            if (passwordLengthCheck || passwordSpaceCheck || passwordNumberCheck || passwordEqualsCheck) {
                if (passwordLengthCheck) {
                    try {
                        throw new WrongPasswordException(PASSWORDLENGTH);
                    } catch (WrongPasswordException e) {
                        e.printStackTrace();
                    }
                }

                if (passwordSpaceCheck) {
                    try {
                        throw new WrongPasswordException(PASSWORDSPACE);
                    } catch (WrongPasswordException e) {
                        e.printStackTrace();
                    }
                }

                if (passwordNumberCheck) {
                    try {
                        throw new WrongPasswordException(PASSWORDNUMBER);
                    } catch (WrongPasswordException e) {
                        e.printStackTrace();
                    }
                }

                if (passwordEqualsCheck){
                    try {
                        throw new WrongPasswordException(PASSWORDEQUALS);
                    } catch (WrongPasswordException e){
                        e.printStackTrace();
                    }
            } else {
                System.out.println(PASSWORDCORRECT);
            }
        }

    }
}
