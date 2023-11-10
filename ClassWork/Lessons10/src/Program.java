public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(person.hashCode());
        System.out.println(person.toString());

        CactusClone cactus = new CactusClone(100,"Green",new Bucket("Silver"));
        CactusClone cactusClone = (CactusClone) cactus.clone();
        cactus.color = "Red";

        System.out.println(cactusClone.color);
        System.out.println(cactus.color);
        System.out.println(cactusClone);

        cactusClone.bucket.material = "Gold";
        System.out.println(cactusClone.bucket);
        System.out.println(cactus.bucket);

    }
}
