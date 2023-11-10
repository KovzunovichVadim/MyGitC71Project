public class Main7 {
    public static void main(String[] args) {

        Garage garage = new Garage();
        House house = new House();
        System.out.println(garage.type);
        System.out.println(house.type);

        // Ссылки родителей

        Build house1 = new Garage(); // Создаем объект который работает
        System.out.println(house1.type);    // код завязанный на house1

        // Множественное наследование нельзя

        // Послдеовательность вызова при создании объекта

        Fox fox = new Fox();
        System.out.println(fox.getAge());
        fox.setAge(20);
        System.out.println(fox.getAge());

    }
}
