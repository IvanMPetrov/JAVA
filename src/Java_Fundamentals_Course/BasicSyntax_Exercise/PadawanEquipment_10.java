package Java_Fundamentals_Course.BasicSyntax_Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    double moneyOwned = Double.parseDouble(scanner.nextLine());//100
    int numberOfStudents = Integer.parseInt(scanner.nextLine());//2
    double pricePerSaber = Double.parseDouble(scanner.nextLine());//1.0
    double pricePerRobe = Double.parseDouble(scanner.nextLine());//2.0
    double pricePerBelt = Double.parseDouble(scanner.nextLine());//3.0

    int freebelts = numberOfStudents / 6;
    //double number = 42;
    //double percent = number +(number *0.10); numberstudents
    double percent = numberOfStudents + (numberOfStudents * 0.10);

    //sabresPrice * (studentsCount + 10%)
    double calc1 = pricePerSaber * Math.ceil(percent);
    double calc2 = pricePerRobe * numberOfStudents;
    double calc3 = pricePerBelt * (numberOfStudents - freebelts);
    double totalPrice = calc1 + calc2 + calc3;

    if (totalPrice > moneyOwned){
        double moneyNeeded = totalPrice - moneyOwned;
        System.out.printf("George Lucas will need %.2flv more.",moneyNeeded);
    }else{
        System.out.printf("The money is enough - it would cost %.2flv.",totalPrice,moneyOwned);
    }




}
}
