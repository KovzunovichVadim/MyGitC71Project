public class TaskClass6_2 {
    public static void main(String[] args) {
        Person6 person1 = new Person6();
        Person6 person = new Person6("Dima Bilan", 47, new Dog("Timoshka"));
        System.out.println(person.age);
        System.out.println(person.fullName);
        System.out.println(person.dog.dogName);
        person.talk("TeachMeSkills");
        person.walkingWithDog();
    }
}
