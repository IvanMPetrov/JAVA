package Java_OOP_Course.Polymorphism;

import java.text.DecimalFormat;

public class Car implements Vehicle{

    final static double AC_ADITIONAL_CONSUMPTION = 0.9;
    //Car and truck both have fuel quantity,
    // and fuel consumption in liters per km and can be driven
    // given distance and refueled with given liters

    private double fuelQuantity;
    private double fuelConsumption;

    public Car(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        setFuelConsumption(fuelConsumption);
    }

    private double getFuelQuantity() {
        return fuelQuantity;
    }





    private void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption  + AC_ADITIONAL_CONSUMPTION;
    }


    @Override
    public void refuel(double quantity) {
        fuelQuantity += quantity;
    }

    @Override
    public String drive(double kmsToTravel,String typeOfVehicle) {
        DecimalFormat df = new DecimalFormat("##.##");
        double fuelNeeded = fuelConsumption * kmsToTravel;
        if (getFuelQuantity() > fuelNeeded){
            fuelQuantity -= fuelNeeded;
            return String.format("%s travelled %s km",typeOfVehicle,df.format(kmsToTravel));
        }
        return String.format("%s needs refueling",typeOfVehicle);
    }

    @Override
    public double fuelLeft() {
        return getFuelQuantity();
    }
}

