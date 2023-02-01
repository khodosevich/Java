package Enum;

public enum Season {
    SUMMER(35),AUTUMN(10),WINTER(-10),SPRING(10);

    Season(){}

    private int temperature;

    Season(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
