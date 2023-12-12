public class Task17_3 {
    public static void main(String[] args) {
        IShare result = (a,b) -> a*b;
        IShare result2 = (a,h) -> (int) (0.5*a*h);

        System.out.println(result.getSquare(5,10));
        System.out.println(result2.getSquare(6,7));
    }
}
