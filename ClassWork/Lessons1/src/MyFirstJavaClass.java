public class    MyFirstJavaClass {
    //main - метод/функция

    public static void main(String[] args) {
        //sout - сокращение
        System.out.println("Hello world from group 71");

        //целочисленные
        byte age = 13;  //поле, характеристика, переменная
        short ageShort = 13;
        int ageInt = 13;
        long ageLong = 13;
        System.out.println(age);
        //some changes
        //с плавающей точкой/дробные
        float a = 2.1f;
        double b = 2.1;

        //Правда, ложь
        boolean flagT = true;
        boolean flagF = false;

        //Символьный ''
        char character = 'a';
        char characterU = '\u4567';
        System.out.println(characterU);

        //Ссылочные типы данных
        //String -строки, позволят создавать без new
        String line = "Hello world";

        //Преобразование типов
        //Автоматическое
        int x = 10;
        long y = x;
        //Явное, перед значением указать в () тип данных
        long z = 150;
        byte w = (byte) z;

        System.out.println(w);

        //Операторы Java
        double aa = 20;
        int ba = 10;
        System.out.println(aa + ba);

        //Логические
        int ab = 21;
        int bb = 21;

        if (a != b) {
            System.out.println("Cool");
        }

        //Тернарный оператор
        // условие ? что если True: что если False;
        int ageT = 20;
        System.out.println(ageT > 17 ? "Совершенен" : "Не совершенен");
        int ageR = 21;

        if (true){
            System.out.println("Hello git");
        }
    }
}
