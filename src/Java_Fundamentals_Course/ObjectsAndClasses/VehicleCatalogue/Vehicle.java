package Java_Fundamentals_Course.ObjectsAndClasses.VehicleCatalogue;

public class Vehicle {

    private String typeCar;
    private String modelCar;
    private String color;
    private String horsepower;

    public Vehicle(String typeCar,String modelCar,String color,String horsepower){
        this.typeCar = typeCar;
        this.modelCar = modelCar;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModelCar() {
        return modelCar;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public String getTypeCar() {
        return typeCar;
    }

    @Override
    public String toString(){
        //Type: Car
        //Model: Ferrari
        //Color: red
        //Horsepower: 550
        return String.format("Type: %s%n" + "Model: %s%n" + "Color: %s%n" + "Horsepower: %s",typeCar,modelCar,color,horsepower);

    }

    //Type: {typeOfVehicle}
    //Model: {modelOfVehicle}
    //Color: {colorOfVehicle}
    //Horsepower: {horsepowerOfVehicle}
}
