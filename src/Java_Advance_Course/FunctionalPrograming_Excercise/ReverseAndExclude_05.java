package Java_Advance_Course.FunctionalPrograming_Excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reverses a collection and removes elements that are divisible by a given integer n.

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int magicNumber = Integer.parseInt(scanner.nextLine());

        Collections.reverse(list);

        list.removeIf(number -> number % magicNumber == 0);

        list.forEach(number -> System.out.print(number + " "));

    }
}
