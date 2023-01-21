package Java_OOP_Course.Abstractions_First_Lection.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readInputFromConsole(scanner.nextLine());
        int row = dimensions[0];
        int col = dimensions[1];

        int[][] galaxy = new int[row][col];
        creatingTheGalaxy(row, col, galaxy);

        String command = scanner.nextLine();

        long starsCollected = 0;

        while (!command.equals("Let the Force be with you")) {

            starsCollected = calculatingStarsByIteratingGalaxy(scanner, galaxy, command, starsCollected);

            command = scanner.nextLine();
        }

        System.out.println(starsCollected);

    }

    private static long calculatingStarsByIteratingGalaxy(Scanner scanner, int[][] galaxy, String command, long starsCollected) {
        int[] jediIvo = readInputFromConsole(command);
        int[] evilForce = readInputFromConsole(scanner.nextLine());

        int evilRow = evilForce[0];
        int evilCol = evilForce[1];

        evilForceMove(galaxy, evilRow, evilCol);

        int jediRow = jediIvo[0];
        int jediCol = jediIvo[1];

        starsCollected = jediMove(galaxy, starsCollected, jediRow, jediCol);
        return starsCollected;
    }

    private static long jediMove(int[][] galaxy, long sum, int jediRow, int jediCol) {
        while (jediRow >= 0 && jediCol < galaxy[1].length) {
            if (jediRow < galaxy.length && jediCol >= 0 && jediCol < galaxy[0].length) {
                sum += galaxy[jediRow][jediCol];
            }

            jediCol++;
            jediRow--;
        }
        return sum;
    }

    private static void evilForceMove(int[][] galaxy, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow < galaxy.length && evilCol < galaxy[0].length) {
                galaxy[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static void creatingTheGalaxy(int row, int col, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = value++;
            }
        }


    }

    private static int[] readInputFromConsole(String scanner) {
        return Arrays.stream(scanner.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
