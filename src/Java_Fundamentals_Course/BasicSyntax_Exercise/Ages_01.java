package Java_Fundamentals_Course.BasicSyntax_Exercise;

import java.util.Scanner;

public class Ages_01 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //•	0-2 – baby;
    //•	3-13 – child;
    //•	14-19 – teenager;
    //•	20-65 – adult;
    //•	>=66 – elder;
    //•	All the values are inclusive.

    int age = Integer.parseInt(scanner.nextLine());
    if (age >= 0 && age <= 2) {
        System.out.println("baby");
    } else if (age <= 13) {
        System.out.println("child");
    } else if (age <= 19) {
        System.out.printf("teenager");
    } else if (age <= 65) {
        System.out.printf("adult");
    } else {
        System.out.printf("elder");
    }


}
}
