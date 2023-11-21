public class Person{
    int age;

    public Person(int age) throws AgeException {
        if (age<18){
            throw new AgeException(age);
        }
        this.age = age;
    }
}
