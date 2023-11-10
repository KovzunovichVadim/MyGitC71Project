public class Dog7 {
    String dogName;
    Integer age;

    public Dog7(String dogName){
        this.dogName = dogName;
    }

    public Dog7(String dogName, Integer dogAge){
        this(dogName);
        this.age = dogAge;
    }
}
