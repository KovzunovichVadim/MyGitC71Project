public class Person implements Cloneable {
    String name = "Vadim";
    int age = 35;
    int money = 2000;
    Cat9 cat = new Cat9();

    public Person(String name, int age, int money, Cat9 cat) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.cat = cat;
    }

    @Override
    public int hashCode() {
        return 17*age + (name.hashCode() + money);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", cat=" + cat +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person6 personClone = (Person6) super.clone();
        personClone.cat = (Cat9) this.cat.clone();
        return personClone;
    }
}
