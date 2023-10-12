public class PrimerSwitch {
    public static void main(String[] args) {

        int age = 20;

        /*switch (age){
            // case 10 -> ....
            // case 20 -> ....
            // case 13 -> ....
            // default -> что делать если ничего не подошло?
            case 10:
                System.out.println("Десятка");
                break;
            case 20:
                System.out.println("Двадцать");
                break;
            case 13:
                System.out.println("Тринадцать");
                break;
            default:
                System.out.println("Я не знаю что это");
        }*/

        String result = switch (age) {
            case 10 -> "Десятка";
            case 20 -> "Двадцать";
            case 13 -> "Тринадцать";
            default -> "Я не знаю что это";
        };
        System.out.println(result);
        switch (age) {
            case 10 -> System.out.println("Десятка");
            case 20 -> System.out.println("Двадцать");
            case 13 -> System.out.println("Тринадцать");
            default -> System.out.println("Я не знаю что это");
        }
    }
}