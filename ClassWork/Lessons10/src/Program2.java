public class Program2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person6 person = new Person6("Vadim",35,2000,new Cat9());
        Person6 personClone = (Person6) person.clone();

        person.cat.catName = "Timoshka";
    }
}
