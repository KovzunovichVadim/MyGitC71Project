public class Program2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Vadim",35,2000,new Cat());
        Person personClone = (Person) person.clone();

        person.cat.catName = "Timoshka";
    }
}
