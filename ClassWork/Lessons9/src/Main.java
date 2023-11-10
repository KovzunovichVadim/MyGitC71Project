public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.doVoice();
        cat.doVoice();

        System.out.println(dog.doVoice());

        Computer hp = new HP();
        Computer mac = new Mac();

        hp.getClassName();
        mac.getClassName();
    }
}