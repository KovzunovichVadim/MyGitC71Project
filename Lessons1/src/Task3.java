public class Task3 {
    public static void main(String[] args) {
        int n = 126;
        int a = n / 100;
        int b = (n- a * 100) / 10;
        int c = n % 10;
        int summ = a + b + c;
        System.out.println("Сумма: " + summ);
    }
}
