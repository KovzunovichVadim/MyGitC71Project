public class Person10 implements Cloneable {
    String name = "Vadim";
    int age = 35;
    int money = 2000;
    Cat cat = new Cat();

    public Person10(){

    }

    public Person10(String name, int age, int money, Cat cat) {
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
        Person10 personClone = (Person10) super.clone();
        personClone.cat = (Cat) this.cat.clone();
        return personClone;
    }
}
