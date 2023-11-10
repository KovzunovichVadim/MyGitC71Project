public class Bucket implements Cloneable{
    public String material;

    public Bucket(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "material='" + material + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
