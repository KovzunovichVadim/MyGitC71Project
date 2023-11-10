import java.util.Base64;

public class CactusClone implements Cloneable{
    public int cost;
    public String color;
    public Bucket bucket;

    public CactusClone(int cost, String color, Bucket bucket) {
        this.cost = cost;
        this.color = color;
        this.bucket = bucket;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CactusClone cactusClone = (CactusClone) super.clone();
        cactusClone.bucket = (Bucket) this.bucket.clone();

        return cactusClone;
    }

    @Override
    public String toString() {
        return "CactusClone{" +
                "cost=" + cost +
                ", color='" + color + '\'' +
                ", bucket=" + bucket +
                '}';
    }
}
