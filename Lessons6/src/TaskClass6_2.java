public class TaskClass6_2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person = new Person("Dima Bilan", 47, new Dog("Timoshka"));
        System.out.println(person.age);
        System.out.println(person.fullName);
        System.out.println(person.dog.dogName);
        person.talk("TeachMeSkills");
        person.walkingWithDog();

    }
}
