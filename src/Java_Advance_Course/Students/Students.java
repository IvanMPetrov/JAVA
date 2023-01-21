package Java_Advance_Course.Students;

public class Students {

    private String firstName;
    private String secondName;
    private double grade;


    public Students(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {//Rocco Erben: 6.00
        // this.firstName + " " + this.secondName + ": " + this.grade;
        return String.format("%s %s: %.2f",this.firstName,this.secondName,this.grade);
    }
}
