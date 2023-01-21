package Java_Fundamentals_Course.BasicSyntax_Exercise;

import java.util.Scanner;

public class Vacation_03 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberOfPeople = Integer.parseInt(scanner.nextLine());
    String typePerson = scanner.nextLine();
    String day = scanner.nextLine();

    if (typePerson.equals("Business") && numberOfPeople >= 100) {
        numberOfPeople = numberOfPeople - 10;
    }

    double totalSum = 0;
    double discount = 0;

    if (typePerson.equals("Students")) {

        if (day.equals("Friday")) {//8,45
            totalSum = 8.45 * numberOfPeople;

        } else if (day.equals("Saturday")) {//9.80
            totalSum = 9.80 * numberOfPeople;

        } else if (day.equals("Sunday")) {//10.46
            totalSum = 10.46 * numberOfPeople;
        }

    } else if (typePerson.equals("Business")) {

        if (day.equals("Friday")) {//10.90
            totalSum = 10.90 * numberOfPeople;
            System.out.printf("Total price: %.2f",totalSum);
            return;

        } else if (day.equals("Saturday")) {//15.60
            totalSum = 15.60 * numberOfPeople;
            System.out.printf("Total price: %.2f",totalSum);
            return;

        } else if (day.equals("Sunday")) {//16
            totalSum = 16 * numberOfPeople;
            System.out.printf("Total price: %.2f",totalSum);
            return;

        }

    } else if (typePerson.equals("Regular")) {

        if (day.equals("Friday")) {//15
            totalSum = 15 * numberOfPeople;
        } else if (day.equals("Saturday")) {//20
            totalSum = 20 * numberOfPeople;
        } else if (day.equals("Sunday")) {//22.50
            totalSum = 22.50 * numberOfPeople;
        }

    }
    if (numberOfPeople >= 30 && typePerson.equals("Students")) {
        //15% otstypka 200 * 0.85
        discount = totalSum * 0.85;
        System.out.printf("Total price: %.2f",discount);
        return;
    } else if (typePerson.equals("Regular") && numberOfPeople >= 10 && numberOfPeople <= 20) {
        //5% otstypka na cqlata cena
        discount = totalSum * 0.95;
        System.out.printf("Total price: %.2f",discount);
        return;
    }
    System.out.printf("Total price: %.2f",totalSum);

}
}
