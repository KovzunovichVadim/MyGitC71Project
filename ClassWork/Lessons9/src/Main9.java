public class Main9 {
    public static void main(String[] args) {
        Dog9 dog = new Dog9();
        Cat9 cat = new Cat9();

        dog.doVoice();
        cat.doVoice();

        System.out.println(dog.doVoice());

        Computer hp = new HP();
        Computer mac = new Mac();

        hp.getClassName();
        mac.getClassName();
    }
}