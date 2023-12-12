public class WrongLoginException extends Exception{
    private String text;

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
        this.text = getMessage();
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "text='" + text + '\'' +
                '}';
    }
}
