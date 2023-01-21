package Exams_And_Preparations.Java_OOP.ChristmasPastryShop.entities.booths;

public class PrivateBooth extends BaseBooth {

    public static final double pricePerPerson = 3.50d;

    public PrivateBooth(int bootNumber, int capacity) {
        super(bootNumber, capacity, pricePerPerson);
    }
}
