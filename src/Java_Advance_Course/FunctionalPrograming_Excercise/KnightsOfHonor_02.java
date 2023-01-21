package Java_Advance_Course.FunctionalPrograming_Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Consumer<String> addition = n -> System.out.println("Sir " + n);

        names.stream().forEach(addition);

    }
}