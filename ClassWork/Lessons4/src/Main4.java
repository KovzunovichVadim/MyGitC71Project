public class Main4 {
    public static void main(String[] args) {
        String number50 = "50";
        String number100 = "100";
        String numberDouble = "50.0";

        //String -> int
        // ссылочный тип int Integer
        int newNumber = Integer.parseInt(number50);         // "50" -> 50
        int newNumber2 = Integer.parseInt(number100);         // "100" -> 100
        double newDouble = Double.parseDouble(numberDouble);    // "50" -> 50.0

        System.out.println(newNumber + newNumber2);

        //int -> String
        String numberStr = String.valueOf(100);
        String numberStrSecond = 100 + "";
        System.out.println(numberStr+numberStrSecond);
    }

}