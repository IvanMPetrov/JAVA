package Java_Fundamentals_Course.List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pokemon_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distance = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int removedItems = 0;

        while (distance.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= distance.size() - 1) {
                //When you receive an index, you must remove the element at that index from the sequence
                // (as if you've captured the Pokémon).
                int item = distance.get(index);
                distance.remove(index);
                removedItems = removedItems + item;
                //The array is {4, 5, 3}. The index is 1.
                //We remove 5, and we increase all lower than it
                //and decrease all higher than it.
                for (int i = 0; i < distance.size() ; i++) {
                    if (item < distance.get(i)) {//uvelichavane
                        int sum = distance.get(i) - item;
                        distance.set(i, sum);
                    } else if (item >= distance.get(i)) {//namalqvane
                        int sum = distance.get(i) + item;
                        distance.set(i, sum);
                    }

                }
            } else if (index < 0) {
                //remove the first element of the sequence,and COPY the last element to its place
                //премахваме първия елемент и на негово място поставяме последния елемент 4 5 3
                int firstElement = distance.get(0);
                int lastElement = distance.get(distance.size() - 1);
                distance.set(0, lastElement);
                removedItems = removedItems + firstElement;

                for (int element = 0; element < distance.size(); element++) {
                    if (distance.get(element) <= firstElement) {//uvelichavane
                        int sum = distance.get(element) + firstElement;
                        distance.set(element, sum);
                    } else if (distance.get(element) > firstElement) {//namalqvane
                        int sum = distance.get(element) - firstElement;
                        distance.set(element, sum);
                    }//You must INCREASE the value of all elements in the sequence which are LESS or EQUAL to the removed element,
                    //with the value of the removed element.
                    //You must DECREASE the value of all elements in the sequence which are GREATER than the removed element,
                    //with the value of the removed element.
                }
            }else if (index > distance.size() - 1) {
                // remove the last element from the sequence, and COPY the first element to its place.
                int firstElement = distance.get(0);
                int lastElement = distance.get(distance.size() - 1);
                distance.set(distance.size() - 1, firstElement);
                removedItems = removedItems + lastElement;

                for (int element = 0; element < distance.size() ; element++) {
                    if (distance.get(element) <= lastElement) {//3 <= 4
                        int sum = distance.get(element) + lastElement;//3 + 4=7
                        distance.set(element, sum);//позиция i =
                    } else if (distance.get(element) > lastElement) {// 3 > 2
                        int sum = distance.get(element) - lastElement;//3 - 2 = 1
                        distance.set(element, sum); //позиция i = 1
                    }
                }
            }

           //index = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(removedItems);
    }
}
