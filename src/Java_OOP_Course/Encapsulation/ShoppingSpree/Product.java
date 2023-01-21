package Java_OOP_Course.Encapsulation.ShoppingSpree;

public class Product {

    private String name;
    private double cost;


    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

}
