package Java_OOP_Course.Polymorphism;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //•	On the first line - information about the car in format "Car {fuel quantity} {liters per km}".
        //•	On the second line – info about the truck in the format "Truck {fuel quantity} {liters per km}".
        //•	On the third line - a number of commands N will be given on the next N lines.
        //•	On the next N lines – commands in the format:

        //Car 15 0.3
        //Truck 100 0.9

        Vehicle car = vehicleCreate(scanner);
        Vehicle truck = vehicleCreate(scanner);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            double argument = Double.parseDouble(command[2]);

            switch (command[0]) {//Drive Car 9
                case "Drive":
                    System.out.println(vehicleMap.get(command[1]).drive(argument,command[1]));
                    break;
                case "Refuel":
                    vehicleMap.get(command[1]).refuel(argument);
                    break;
            }
        }

        vehicleMap.forEach((s, vehicle) -> System.out.println(s + ": " + vehicle.fuelLeft()));


    }

    private static Vehicle vehicleCreate(Scanner scanner) {
        String[] vehicleInfo = scanner.nextLine().split(" ");
        String vehicleType = vehicleInfo[0];
        double fuelQuantity = Double.parseDouble(vehicleInfo[1]);
        double litersPerKm = Double.parseDouble(vehicleInfo[2]);
        if (vehicleType.equals("Car")) {
            return new Car(fuelQuantity, litersPerKm);
        }
        return new Truck(fuelQuantity, litersPerKm);

    }

}
