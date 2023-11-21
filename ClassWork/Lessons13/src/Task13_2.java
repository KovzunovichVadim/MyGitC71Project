public class Task13_2 {
    public static void main(String[] args){
        Person person = null;

        try {
            person = new Person(18);
            System.out.println(person.age);
        } catch (AgeException e){
            System.out.println(e);
        }
    }
}
