public class WrongPasswordException extends Exception {
    private String text;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
        this.text = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "text='" + text + '\'' +
                '}';
    }
}
