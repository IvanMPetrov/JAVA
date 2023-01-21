package Java_Fundamentals_Course.Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11_MoreExerecise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] command = scanner.nextLine().split(" ");

        while (true) {
            switch (command[0]) {
                case "end":
                    System.out.print("[");
                    for (int i = 0; i < intArray.length; i++) {
                        if (i == intArray.length - 1) {
                            System.out.print(intArray[i] + "]");
                            return;
                        }
                        System.out.print(intArray[i] + ", ");
                    }
                case "exchange":
                    int number = Integer.parseInt(command[1]);
                    printExchangeCommand(intArray, number);
                    break;
                case "max":
                    if (command[1].equals("even")) {      //метод който проверява дали има поне 1 четно число в масива
                        if (isThereEvenNumber(intArray)) {//ако е true втори метод за намиране на числото
                            //maxEven(intArray);//test
                            System.out.println(maxEven(intArray));
                            break;
                        } else {                            //ако е false принтира "No matches"
                            System.out.println("No matches");
                            break;
                        }
                    } else if (command[1].equals("odd")) { //метод който проверява дали има поне 1 нечетно число в масива
                        if (isThereOddNumber(intArray)) {//ако е true втори метод за намиране на числото
                            //maxOdd(intArray);//test
                            System.out.println(maxOdd(intArray));
                            break;
                        } else {                            //ако е false принтира "No matches"
                            System.out.println("No matches");
                            break;
                        }
                    }
                    break;
                case "min":
                    if (command[1].equals("even")) {
                        if (isThereEvenNumber(intArray)) {
                            //minEven(intArray);//test
                            System.out.println(minEven(intArray));
                            break;
                        } else {
                            System.out.println("No matches");
                            break;
                        }
                    } else if (command[1].equals("odd")) {
                        if (isThereOddNumber(intArray)) {
                            //minOdd(intArray);//test
                            System.out.println(minOdd(intArray));
                            break;
                        } else {
                            System.out.println("No matches");
                            break;
                        }
                    }
                    break;
                case "first":
                    if (command[2].equals("even")) {
                        int numbersNeeded = Integer.parseInt(command[1]);
                        if (numbersNeeded > intArray.length) {
                            System.out.println("Invalid count");
                            break;
                        }
                        if (isThereEvenNumber(intArray)) {
                            firstEven(intArray, numbersNeeded);
                            break;
                        } else {
                            System.out.println("[]");
                            break;
                        }
                    } else if (command[2].equals("odd")) {
                        int numbersNeeded = Integer.parseInt(command[1]);
                        if (numbersNeeded > intArray.length) {
                            System.out.println("Invalid count");
                            break;
                        } else if (isThereOddNumber(intArray)) {
                            firstOdd(intArray, numbersNeeded);
                            break;
                        } else {
                            System.out.println("[]");
                            break;
                        }
                    }
                case "last":
                    if (command[2].equals("even")) {
                        int numbersNeed = Integer.parseInt(command[1]);
                        if (isThereEvenNumber(intArray)) {
                            lastEven(intArray, numbersNeed);
                            break;
                        } else {
                            System.out.println("[]");
                            break;
                        }
                    } else if (command[2].equals("odd")) {
                        int numbersNeed = Integer.parseInt(command[1]);
                        if (isThereOddNumber(intArray)) {
                            lastOdd(intArray, numbersNeed);
                            break;
                        }
                    } else {
                        System.out.println("[]");
                        break;
                    }
            }
            command = scanner.nextLine().split(" ");
        }
    }

    private static void printExchangeCommand(int[] intArray, int number) {//метод който разменя позициите на елементите в масива
        if (intArray.length - 1 < number) {
            System.out.println("Invalid index");
            return;
        }
        int currentItem = 0;
        if (number == 0) {
            number = 1;
        }
        for (int i = 0; i < number; i++) {
            currentItem = intArray[intArray.length - 1];
            for (int j = intArray.length - 1; j > 0; j--) {
                intArray[j] = intArray[j - 1];
            }
            intArray[0] = currentItem;
        }
    }//метод който разменя позициите на елементите в масива

    private static boolean isThereEvenNumber(int[] intArray) {//метод който проверява дали има поне едно четно число
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                return true;
            }
        }
        return false;
    }//метод който проверява дали има поне едно четно число

    private static boolean isThereOddNumber(int[] intArray) {//метод който проверява дали има поне едно нечетно число
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 1) {
                return true;
            }
        }
        return false;
    }//метод който проверява дали има поне едно нечетно число

    private static int maxEven(int[] intArray) {//метод който проверява кое е най-голямото четно число
        int maxEvenPosition = 0;
        int currentNum = 0;
        int highestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            currentNum = intArray[i];
            if (currentNum % 2 == 0) {
                if (highestNumber <= currentNum) {
                    maxEvenPosition = i;
                    highestNumber = currentNum;
                }
            }
        }
        return maxEvenPosition;
    }//метод който проверява кое е най-голямото четно число

    private static int maxOdd(int[] intArray) {//метод който проверява кое е най-голямото нечетно число
        int maxOddPosition = 0;
        int currentNum = 0;
        int highestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            currentNum = intArray[i];
            if (currentNum % 2 == 1) {
                if (highestNumber <= currentNum) {
                    maxOddPosition = i;
                    highestNumber = currentNum;
                }
            }
        }
        return maxOddPosition;
    }//метод който проверява кое е най-голямото нечетно число

    private static int minEven(int[] intArray) {//метод който проверява кое е най-малкото четно число
        int minEvenPosition = 0;
        int currentNum = 0;
        int lowestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            currentNum = intArray[i];
            if (currentNum % 2 == 0) {
                if (lowestNumber >= currentNum) {
                    minEvenPosition = i;
                    lowestNumber = currentNum;
                }
            }
        }
        return minEvenPosition;
    }//метод който проверява кое е най-малкото четно число

    private static int minOdd(int[] intArray) {//метод който проверява кое е най-малкото нечетно число
        int minOddPosition = 0;
        int currentNum = 0;
        int lowestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            currentNum = intArray[i];
            if (currentNum % 2 == 1) {
                if (lowestNumber >= currentNum) {
                    minOddPosition = i;
                    lowestNumber = currentNum;
                }
            }
        }
        return minOddPosition;
    }//метод който проверява кое е най-малкото нечетно число

    private static void firstEven(int[] intArray, int numbersNeeded) {//метод който проверява първите N четни числа и ги принтира
        int[] temporaryArray = new int[numbersNeeded + 1];//0-8 / 1 - 4
        int counter = 0;
        int currentNumber = 0;
        if (numbersNeeded > intArray.length) {
            System.out.println("Invalid count");
            return;
        }
        for (int i = 0; i < intArray.length; i++) {
            currentNumber = intArray[i];// 1 8 4 3
            if (currentNumber % 2 == 0) {//1 няма да влезне / 8 отива на позиция 0/4 отива на позиция 1 / 3 няма да влезне
                temporaryArray[counter] = currentNumber;
                counter++;
                if (counter == numbersNeeded) {
                    break;
                }
            }
        }
        boolean x = true;
        for (int i = 0; i < temporaryArray.length; i++) {
            if (x) {
                System.out.print("[");
                x = false;
            }
            if (i == temporaryArray.length - 1) {
                //posledno chislo
                System.out.print(temporaryArray[i]);
            }
            if (temporaryArray[i] != 0 && temporaryArray[i + 1] != 0) {
                System.out.print(temporaryArray[i] + ", ");
            } else {
                System.out.print(temporaryArray[i]);
                break;
            }
        }
        System.out.print("]");
        System.out.println();
        return;
    }//метод който проверява първите N четни числа и ги принтира

    private static void firstOdd(int[] intArray, int numbersNeeded) {//метод който проверява първите N нечетни числа и ги принтира
        int[] temporaryArray = new int[numbersNeeded + 1];
        int counter = 0;
        int currentNumber = 0;
        if (numbersNeeded > intArray.length) {
            System.out.println("Invalid count");
            return;
        }
        for (int i = 0; i < intArray.length; i++) {
            currentNumber = intArray[i];
            if (currentNumber % 2 == 1) {
                temporaryArray[counter] = currentNumber;
                counter++;
                if (counter == numbersNeeded) {
                    break;
                }
            }
        }
        boolean x = true;
        for (int i = 0; i < temporaryArray.length; i++) {
            if (x) {
                System.out.print("[");
                x = false;
            }
            if (i == temporaryArray.length - 1) {

                System.out.print(temporaryArray[i]);
            }
            if (temporaryArray[i] != 0 && temporaryArray[i + 1] != 0) {
                System.out.print(temporaryArray[i] + ", ");
            } else {
                System.out.print(temporaryArray[i]);
                break;
            }
        }
        System.out.print("]");
        System.out.println();
        return;
    }//метод който проверява първите N нечетни числа и ги принтира

    private static void lastOdd(int[] intArray, int numbersNeeded) {//метод който проверява последните N нечетни числа и ги принтира
        int[] temporaryArray = new int[numbersNeeded + 1];
        int counter = 0;
        int currentNumber = 0;
        if (numbersNeeded > intArray.length) {
            System.out.println("Invalid count");
            return;
        }
        for (int i = intArray.length - 1; i >= 0; i--) {
            currentNumber = intArray[i];// 1 8 4 3
            if (currentNumber % 2 == 1) {//1 няма да влезне / 8 отива на позиция 0/4 отива на позиция 1 / 3 няма да влезне
                temporaryArray[counter] = currentNumber;
                counter++;
                if (counter == numbersNeeded) {
                    break;
                }
            }
        }
        boolean x = true;
        for (int i = 0; i < temporaryArray.length; i++) {
            if (x) {
                System.out.print("[");
                x = false;
            }
            if (i == temporaryArray.length - 1) {

                System.out.print(temporaryArray[i]);
            }
            if (temporaryArray[i] != 0 && temporaryArray[i + 1] != 0) {
                System.out.print(temporaryArray[i] + ", ");
            } else {
                System.out.print(temporaryArray[i]);
                break;
            }
        }
        System.out.print("]");
        System.out.println();
        return;
    }//метод който проверява последните N нечетни числа и ги принтира

    private static void lastEven(int[] intArray, int numbersNeeded) {//метод който проверява последните N четни числа и ги принтира
        int[] temporaryArray = new int[numbersNeeded + 1];
        int counter = 0;
        int currentNumber = 0;
        if (numbersNeeded > intArray.length - 1) {
            System.out.println("Invalid count");
            return;
        }
        for (int i = intArray.length - 1; i >= 0; i--) {
            currentNumber = intArray[i];// 1 8 4 3
            if (currentNumber % 2 == 0) {//1 няма да влезне / 8 отива на позиция 0/4 отива на позиция 1 / 3 няма да влезне
                temporaryArray[counter] = currentNumber;
                counter++;
                if (counter == numbersNeeded) {
                    break;
                }
            }
        }
        boolean x = true;
        for (int i = 0; i < temporaryArray.length; i++) {
            if (x) {
                System.out.print("[");
                x = false;
            }
            if (i == temporaryArray.length - 1) {

                System.out.print(temporaryArray[i]);
            }
            if (temporaryArray[i] != 0 && temporaryArray[i + 1] != 0) {
                System.out.print(temporaryArray[i] + ", ");
            } else {
                System.out.print(temporaryArray[i]);
                break;
            }
        }
        System.out.print("]");
        System.out.println();
        return;
    }//метод който проверява последните N четни числа и ги принтира
}

