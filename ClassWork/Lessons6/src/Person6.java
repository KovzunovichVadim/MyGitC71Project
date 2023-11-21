public class Person6 {
    String fullName = "Vadim";
    int age = 35;
    Dog9 dog;

    void talk(String text) {
        System.out.println(fullName + " talk " + text + "...");
    }

    void walkingWithDog() {
        System.out.println(fullName + " walk with his dog " + dog.dogName);
    }

    public Person6() {
    }

    public Person6(String fullName, int age, Dog9 dog) {
        this.fullName = fullName;
        this.age = age;
        this.dog = dog;
    }
}
