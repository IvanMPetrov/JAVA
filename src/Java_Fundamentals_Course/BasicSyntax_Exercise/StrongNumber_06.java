package Java_Fundamentals_Course.BasicSyntax_Exercise;

import java.util.Scanner;

public class StrongNumber_06 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = Integer.parseInt(scanner.nextLine());//40585 5-120 / 8 -40320 / 5 - 120 / 0-0 / 4- 24
    int originNumber = number;
    int sum = 0;
    int startingPoint = 1;
    while (number > 0) {

        int lastDigit = number % 10;

        for (int i = 1; i <= lastDigit; i++) {
            startingPoint = startingPoint * i;

        }
        sum = sum + startingPoint;
        startingPoint = 1;
        number = number / 10;
    }
    if (originNumber == sum){
        System.out.println("yes");
    }else {
        System.out.println("no");
    }

}
}
