public class primer1 {
    public static void main(String[] args) {
        int n1 = 26;
        int k1 = 5;
        int m1 = n1%10;
        System.out.println(m1);

        double n = 32;
        double first = n / 10;
        double firstS = Math.floor(first);
        double second = n % 10;
        double sum = firstS + second;
        System.out.println("Result=" + sum);
    }
}
