public class Main8 {
    public static void main(String[] args) {
        /*Fox8 fox = new Fox8();
        fox.run();
        fox.run(10);
        fox.run("в лесу");*/

        Animals8 animal = new Animals8();
        Animals8 animal1 = new Fox8();

        animal.makeVoice();
        animal1.makeVoice();

        System.out.println(Person8.name);
        Person8.namePrint();

    }
}