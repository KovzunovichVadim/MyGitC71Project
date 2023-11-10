public class Calculator {
    double weight = 10.0;
    double cost = 100.0;
    String color = "Red";

    {
        System.out.println("Мы сейчас будем создавать объект. Сейчас цвет" + color);
    }

    public Calculator(double weight, double cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    int summ(int x, int y) {
        return x + y;
    }

    int def(int x, int y) {
        return x - y;
    }

    int mult(int x, int y) {
        return x * y;
    }

    double div(double x, double y) {
        return x / y;
    }
}
