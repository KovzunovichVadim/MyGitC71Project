public class Program2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person10 person = new Person10("Vadim",35,2000,new Cat());
        Person10 personClone = (Person10) person.clone();

        person.cat.catName = "Timoshka";
    }
}
