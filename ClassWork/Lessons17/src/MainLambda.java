public class MainLambda {
    public static void main(String[] args) {
        // Описать лямбда
        FunInterface positiveLambda = (a,b) -> a+b;
        FunInterface negativeLambda = (a,b) -> a-b;

        // Использовать
        System.out.println(positiveLambda.calculate(10,200));
        System.out.println(negativeLambda.calculate(10,200));
    }
}
