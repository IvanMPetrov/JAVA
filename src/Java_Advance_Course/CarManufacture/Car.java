package Java_Advance_Course.CarManufacture;

public class Car {

    private Engine engine;
    private String carModel;
    int weight = 0;
    private String color = "n/a";


    public Car(String carModel, int weight, String color, Engine engine) {
        this.carModel = carModel;
        this.weight = weight;//asd
        this.color = color;//asd
        this.engine = engine;
    }

    public Car(Engine engine, String carModel, int weight) {
        this.engine = engine;
        this.carModel = carModel;
        this.weight = weight;
    }

    public Car(Engine engine, String carModel, String color) {
        this.engine = engine;
        this.carModel = carModel;
        this.color = color;
    }

    public Car(Engine engine, String carModel) {
        this.engine = engine;
        this.carModel = carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getWeight() {
        if (weight == 0){
            return "n/a";
        }
        return String.valueOf(weight);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

