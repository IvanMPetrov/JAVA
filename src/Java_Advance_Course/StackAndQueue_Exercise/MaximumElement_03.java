package Java_Advance_Course.StackAndQueue_Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //•	"1 X" - Push the element X into the stack.
        //•	"2" - Delete the element present at the top of the stack.
        //•	"3" - Print the maximum element in the stack.

        int count = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {

            int[] command = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


            if (command[0] == 1) {

                //push
                stack.push(command[1]);

            } else if (command[0] == 2) {

                //pop
                stack.pop();
            } else if (command[0] == 3) {
                int biggestNumber = Integer.MIN_VALUE;
                //print the biggest number
                for (int item : stack) {

                    if (item >= biggestNumber) {
                        biggestNumber = item;
                    }
                }
                System.out.println(biggestNumber);
            }

        }

    }
}
