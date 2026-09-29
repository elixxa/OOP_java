package andr.pr4.seasons;

public enum Season {

    AUTUMN(8){
        @Override
        public String getDescription() {
            return "Дождливое время года";
        }
    },
    WINTER(-10),
    SPRING(10) {
        @Override
        public String getDescription() {
            return "Цветущее время года";
        }
    },
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    };

    private final int averageTemperature;

    private Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}