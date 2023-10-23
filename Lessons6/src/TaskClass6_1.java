public class TaskClass6_1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10.0,100.0, "Orange");
        System.out.println(calculator.color);
        System.out.println(calculator.weight);
        System.out.println(calculator.cost);

        System.out.println(calculator.summ(10,4));
    }
}
