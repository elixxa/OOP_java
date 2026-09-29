package andr.pr4.computer;

public class Processor {

    private String model;
    private double frequency;

    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Процессор: " + model
                + ", частота: " + frequency + " ГГц";
    }
}