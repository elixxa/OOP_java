package andr.praktika21.pr10;

public class Shop {

    private Computer[] computers;
    private int count;

    public Shop(int size) {
        computers = new Computer[size];
        count = 0;
    }

    public void addComputer(Computer computer) {
        if (count < computers.length) {
            computers[count] = computer;
            count++;
        }
    }

    public Computer findComputer(String model) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getModel().equalsIgnoreCase(model)) {
                return computers[i];
            }
        }

        return null;
    }

    public void removeComputer(String model) {

        for (int i = 0; i < count; i++) {

            if (computers[i].getModel().equalsIgnoreCase(model)) {

                for (int j = i; j < count - 1; j++) {
                    computers[j] = computers[j + 1];
                }

                computers[count - 1] = null;
                count--;

                return;
            }
        }
    }

    public void printComputers() {
        for (int i = 0; i < count; i++) {
            System.out.println(computers[i]);
        }
    }
}