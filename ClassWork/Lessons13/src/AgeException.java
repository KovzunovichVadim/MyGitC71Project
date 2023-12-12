public class AgeException extends Exception {
    int age;

    public AgeException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Не достиг 18";
    }
}
