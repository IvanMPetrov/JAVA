package Exams_And_Preparations.Exam_Fundamentals.MidExamFundamentals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffeList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int num = Integer.parseInt(scanner.nextLine());

        int counter = 1;

        while (counter <= num) {
            String command = scanner.nextLine();
            if (command.contains("Include")) {
                //добавяме елемента на последна позиция в листа
                String element = command.split(" ")[1];
                coffeList.add(coffeList.size(), element);

            } else if (command.contains("Remove")) {
                //може да е first или last
                String firstOrLast = command.split(" ")[1];
                int howManyTimes = Integer.parseInt(command.split(" ")[2]);
                if (firstOrLast.contains("first")) {
                    //премахваме първите howManyTimes
                    firstRemove(coffeList, howManyTimes);

                } else if (firstOrLast.contains("last")) {
                    //премахваме последните howManyTimes
                    lastRemove(coffeList, howManyTimes);

                }

            } else if (command.contains("Prefer")) {
                //swap 3 1  3 отива на 1 а 1 отива на 3
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                String item1 = coffeList.get(firstIndex);
                coffeList.set(firstIndex,coffeList.get(secondIndex));
                coffeList.set(secondIndex,item1);

            } else if (command.contains("Reverse")) {
                //обръщаме кода отзад напред Collections. reverse()
                Collections.reverse(coffeList);
            }



            counter++;
        }
        System.out.println("Coffees:");

        for (int i = 0; i < coffeList.size(); i++) {
            System.out.print(coffeList.get(i) + " ");

        }
    }

    private static void firstRemove(List<String> coffeList, int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            coffeList.remove(0);
        }
    }

    private static void lastRemove(List<String> coffeList, int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            coffeList.remove(coffeList.size() - 1);
        }
    }
}
