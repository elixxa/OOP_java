package andr.pr4.computer;

public class Memory {

    private int capacity;

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Оперативная память: " + capacity + " ГБ";
    }
}