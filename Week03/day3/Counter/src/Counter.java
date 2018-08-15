public class Counter {
    int value;
    int initialValue;

    public Counter() {
        this.value = 0;
        this.initialValue = 0;
    }

    public Counter(int value) {
        this.value = value;
        this.initialValue = value;
    }

    public void add(int number) {
        this.value += number;
    }

    public void add() {
        this.value++;
    }

    public int get() {
        return this.value;
    }

    public void reset() {
        this.value = this.initialValue;
    }
}
