package Java_Fundamentals_Course.Methods_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] command = scanner.nextLine().split(" ");

        while (!command.equals("end")) {//1 4 8 2 3
            switch (command[0]) {
                case "exchange":
                    int number = Integer.parseInt(command[1]);
                    printExchangeCommand(intArray, number);
                    break;
                case "max":
                    if (command[1].equals("even")) {      //метод който проверява дали има поне 1 четно число в масива
                        if (isThereEvenNumber(intArray)) {//ако е true втори метод за намиране на числото
                            //maxEven(intArray);
                            System.out.println(maxEven(intArray));
                        } else {//ако е false принтира "No matches"
                            System.out.println("No matches");
                        }
                    } else if (command[1].equals("odd")) {
                        //метод който проверява дали има поне 1 нечетно число в масива
                        if (isThereOddNumber(intArray)) {//ако е true втори метод за намиране на числото
                            //maxOdd(intArray);
                            System.out.println(maxOdd(intArray));
                        } else {//ако е false принтира "No matches"
                            System.out.println("No matches");
                        }
                    }
                    break;
                case "min":
                    if (command[1].equals("even")) {
                        if (isThereEvenNumber(intArray)) {
                            //minEven(intArray);
                            System.out.println(minEven(intArray));
                        }else {
                            System.out.println("No matches");
                        }

                    } else if (command[1].equals("odd")) {
                        if (isThereOddNumber(intArray)){
                            //minOdd(intArray);
                            System.out.println(minOdd(intArray));
                        }else {
                            System.out.println("No matches");
                        }

                    }
                    break;
            }
        }
    }

    //If the index is outside the boundaries of the array, print "Invalid index".
    private static void printExchangeCommand(int[] intArray, int number) {
        if (intArray.length - 1 < number) {
            System.out.println("Invalid index");
            return;
        }
        int currentItem = 0;

        for (int i = 0; i < number; i++) {//1 3 5 7 9 / if number = 2 cikula se vurti 2 pyti
            currentItem = intArray[intArray.length - 1];//9];

            for (int j = intArray.length - 1; j > 0; j--) {//chisloto na prednata poziciq + 1 -> cikula se vurti do indeks 1 vkliuchitelno
                //vzimam 7 i go premestvam s 1 poziciq
                //sled tova vzimam 5 premesetvam s 1 poziciq i taka dokato ne stigna 0
                //pri 0 izlizam ot cikula i prisvoqvam currentNum na poziciq 0
                intArray[j] = intArray[j - 1];//1 3 5 7 9 / 4-2=2

            }
            intArray[0] = currentItem;


        }

    }

    private static boolean isThereEvenNumber(int[] intArray) {
        //метод който проверява дали има поне 1 четно число -> true // false
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                return true;
            }

        }
        return false;
    }

    private static boolean isThereOddNumber(int[] intArray) {
        //метод който проверява дали има поне 1 нечетно число -> true // false
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 1) {
                return true;
            }

        }
        return false;

    }


    //1 4 8 2 3-трябва да върне 2ра позиция от масива,числото 8 е най-голямото четно число
    private static int maxEven(int[] intArray) {
        int maxEvenPosition = 0;
        int currentNum = 0;
        int highestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < intArray.length; i++) {//да проверя дали числото е четно / проверка currentNum >= досега пазеното/
            currentNum = intArray[i];//8

            if (currentNum % 2 == 0) {//четно ли е
                if (highestNumber <= currentNum) {//8 <= моментното число
                    maxEvenPosition = i;
                    highestNumber = currentNum;
                }
            }
        }
        return maxEvenPosition;
    }

    private static int maxOdd(int[] intArray) {
        int maxOddPosition = 0;
        int currentNum =0;
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
    }

    private static int minEven(int[] intArray) {
        int minEvenPosition = 0;
        int currentNum = 0;
        int lowestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < intArray.length; i++) {//да проверя дали числото е четно / проверка currentNum >= досега пазеното/
            currentNum = intArray[i];//8

            if (currentNum % 2 == 0) {//четно ли е
                if (lowestNumber >= currentNum) {//8 <= моментното число
                    minEvenPosition = i;
                    lowestNumber = currentNum;
                }
            }
        }
        return minEvenPosition;
    }
    private static int minOdd ( int[] intArray){
        int minOddPosition = 0;
        int currentNum = 0;
        int lowestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < intArray.length; i++) {//да проверя дали числото е четно / проверка currentNum >= досега пазеното/
            currentNum = intArray[i];//8

            if (currentNum % 2 == 1) {//четно ли е
                if (lowestNumber >= currentNum) {//8 <= моментното число
                    minOddPosition = i;
                    lowestNumber = currentNum;
                }
            }
        }
        return minOddPosition;
    }
}