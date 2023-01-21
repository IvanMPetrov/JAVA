package Exams_And_Preparations.Exam_Fundamentals.MidExamFundamentals;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperiance = Double.parseDouble(scanner.nextLine());

        int battlesCount = Integer.parseInt(scanner.nextLine());
        int battlesDone = 1;

        int counter3Games = 1;
        int counter5Games = 1;
        int counter15Games = 1;
        double sum = 0;
        boolean collected = false;

        while (battlesCount >= battlesDone) {

            double expPerBattle = Double.parseDouble(scanner.nextLine());

            //всяка 3 игра 15% повече експ
            //всяка 5 игра 10% по-малко
            //всяка 15 игра 5% повече
            //спираме програмата ако събере достатъчно експ
            if (counter3Games == 3) {
                counter3Games = 0;
                //poluchava 15% poveche
                expPerBattle = expPerBattle + ( expPerBattle * 0.15);
            } else if (counter5Games == 5) {
                //poluchava 10% po malko
                expPerBattle = expPerBattle - ( expPerBattle * 0.10);
                counter5Games = 0;
            } else if (counter15Games == 15) {
                //poluchava 5% poveche
                counter15Games = 0;
                expPerBattle = expPerBattle + ( expPerBattle * 0.05);
            }
            sum = sum + expPerBattle;



            counter3Games++;
            counter5Games++;
            counter15Games++;
            if (sum >= neededExperiance){
                collected=true;
                break;
            }
            battlesDone++;
        }
        if (collected){
            System.out.printf("Player successfully collected his needed experience for %d battles.",battlesDone);
            return;
        }
        double needed = neededExperiance - sum;
        if (sum < neededExperiance){
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",needed);
            return;
        }
    }
}
