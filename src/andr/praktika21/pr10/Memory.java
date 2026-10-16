package andr.praktika21.pr10;

public class Memory {

    private int capacity;

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return capacity + " ГБ";
    }
}