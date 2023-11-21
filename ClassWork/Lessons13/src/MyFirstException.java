public class MyFirstException extends Exception{
    String text;

    public MyFirstException(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Такой логин уже существует(" + text + "). Выберите другой.";
    }
}
