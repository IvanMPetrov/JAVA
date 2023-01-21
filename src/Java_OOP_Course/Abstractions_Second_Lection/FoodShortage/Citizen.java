package Java_OOP_Course.Abstractions_Second_Lection.FoodShortage;

public class Citizen implements Identifiable, Birthable, Person ,Buyer{



    private  String name;
    private  int age;
    private  String id;
    private String birthDate;
    private int food = 0;


    //Citizen(String, int, String, String)
    //getName(): String
    //getAge(): int
    //getId(): String
    //getFood(): int
    //buyFood(): void

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public void buyFood() {

        this.food += 10;
    }

    @Override
    public int getFood() {
        return food;
    }
}