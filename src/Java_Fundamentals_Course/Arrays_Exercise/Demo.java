package Java_Fundamentals_Course.Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrayNum = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();


        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandType = commandParts[0]; //"swap", "multiply", "decrease"
            switch (commandType) {
                case "swap":

                    int firstNum = Integer.parseInt(commandParts[1]);
                    int secondNum = Integer.parseInt(commandParts[2]);

                    int element1 = arrayNum[firstNum];
                    int element2 = arrayNum[secondNum];

                    //swap
                    arrayNum[firstNum] = element2;
                    arrayNum[secondNum] = element1;
                    break;
                case "multiply":
                    //изпълнявам командата multiply
                    int multiplyElementIndex1 = Integer.parseInt(commandParts[1]);
                    int multiplyElement1 = arrayNum[multiplyElementIndex1];
                    int multiplyElementIndex2 = Integer.parseInt(commandParts[2]);
                    int multiplyElement2 = arrayNum[multiplyElementIndex2];

                    int product = multiplyElement1 * multiplyElement2;
                    arrayNum[multiplyElementIndex1] = product;
                    break;
                case "decrease":
                    //всички елементи в масива -1
                    for (int i = 0; i <= arrayNum.length - 1; i++) {
                        arrayNum[i] = arrayNum[i] - 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        //отпечатваме масива (", ")
        /*for (int index = 0; index <= arrayNum.length - 1; index++) {
            if (index != arrayNum.length - 1) {
                System.out.print(arrayNum[index] + ", ");
            } else {
                System.out.print(arrayNum[index]);
            }
        }*/

        System.out.println(Arrays.toString(arrayNum).replace("[", "").replace("]", ""));
    }
}