import java.util.Objects;

public class Cactus {
    public int cost = 100;

    @Override
    public String toString() {
        return "Cactus: cost = " + cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cactus6 cactus = (Cactus6) o;
        return cost == cactus.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost);
    }
}
