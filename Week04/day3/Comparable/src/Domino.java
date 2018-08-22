import java.util.Arrays;

public class Domino implements Comparable<Domino> {
    private final int[] values;

    Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    private int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino other) {
        return Integer.compare(this.getValues()[0], other.getValues()[0]);
    }
}