public class Person {
    String fullName = "Vadim";
    int age = 35;
    Dog dog;

    void talk(String text) {
        System.out.println(fullName + " talk " + text + "...");
    }

    void walkingWithDog() {
        System.out.println(fullName + " walk with his dog " + dog.dogName);
    }

    public Person() {
    }

    public Person(String fullName, int age, Dog dog) {
        this.fullName = fullName;
        this.age = age;
        this.dog = dog;
    }
}
