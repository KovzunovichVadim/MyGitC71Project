public class Main {
    public static void main(String[] args) {
        Cactus cactus = new Cactus();
        Cactus cactus1 = new Cactus();

        // 1. toString преобразовать объект в строку
        System.out.println(cactus); // toString подразумевается по умолчанию

        // 2. eqals() - для сравнение 2 объектов
        // не переопределенный сравнивает ссылки
        // переопределенный сравнивает сами объекты, а не ссылки
        System.out.println(cactus.equals(cactus1));

        // 3. hashCode() - отдает хэш код объекта
        // не переопределенный  *на область памяти*
        // переопределяемый завязывается на поля и их значения
        System.out.println(cactus.hashCode());
        System.out.println(cactus1.hashCode());

    }
}