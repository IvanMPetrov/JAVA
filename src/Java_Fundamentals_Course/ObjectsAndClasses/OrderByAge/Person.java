package Java_Fundamentals_Course.ObjectsAndClasses.OrderByAge;

public class Person {
    private String name;
    private String ID;
    private int age;

    public Person(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

   @Override
    public String toString(){
        return String.format("%s with ID: %s is %d years old.%n",name,ID,age);
   }
}
//Stephan with ID: 524244 is 10 years old.