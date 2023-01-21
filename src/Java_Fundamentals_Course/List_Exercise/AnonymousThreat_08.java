package Java_Fundamentals_Course.List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lettersArray = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        //•	merge {startIndex} {endIndex}
        //•	divide {index} {partitions}
        String command = scanner.nextLine();
        while (!command.contains("3:1")) {//merge {startIndex} {endIndex} да проверя дали старт индекс и енд са  в границите на листа
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > lettersArray.size() - 1) {
                    endIndex = lettersArray.size() - 1;
                }
                String mergedItems = "";
                if (isInBounds(startIndex, endIndex, lettersArray)) {
                    for (int item = startIndex; item <= endIndex; item++) {
                        String currentItem = lettersArray.get(item);
                        mergedItems = mergedItems + currentItem;
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        lettersArray.remove(startIndex);
                    }
                    lettersArray.add(startIndex, mergedItems);
                }
            } else if (command.contains("divide")) {
                //трябва да разделите елементите на дадения индекс на няколко елемента в масив с еднакви дължини.
                //бройката на разделите трябва да е равна на исканите партиди
                //Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}
                int elementIndex = Integer.parseInt(command.split(" ")[1]);
                int divideParts = Integer.parseInt(command.split(" ")[2]);
                //abcdef 0 3 -> взимам дължината (6) и я разделяме на желаните партиди ( 3 )

                String text = lettersArray.get(elementIndex);//abcdef
                lettersArray.remove(elementIndex);
                int textLength = text.length() ;//6
                int itemsPerIndex = textLength / divideParts;//6/3 = 2

                int position =0;
                for (int i = 1; i < divideParts; i++) {
                    lettersArray.add(elementIndex , text.substring(position, position + itemsPerIndex));
                    elementIndex++;
                    position = position + itemsPerIndex;

                }
                lettersArray.add(position,text.substring(position , text.length()));//abcdef 2
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < lettersArray.size(); i++) {
            System.out.print(lettersArray.get(i) + " ");

        }

    }

    private static boolean isInBounds(int startIndex, int endIndex, List<String> lettersArray) {
        if (startIndex >= 0 && endIndex <= lettersArray.size() - 1 && startIndex < endIndex) {
            return true;
        } else {
            return false;
        }
    }
}
