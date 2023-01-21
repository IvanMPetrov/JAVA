package Java_OOP_Course.Encapsulation.AnimalFarm;

public class Chicken {

    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }
    public double productPerDay(){
        return calculateProductPerDay();
    }

    private double calculateProductPerDay(){
        if (age <= 5){
            //2 na den
            return 2.00;
        }else if (age <= 11){
            //1 na den
            return 1.00;
        }else {
            //0.75
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",name,age,calculateProductPerDay());
    }
}
