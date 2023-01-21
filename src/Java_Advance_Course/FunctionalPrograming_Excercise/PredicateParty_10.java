package Java_Advance_Course.FunctionalPrograming_Excercise;

import java.util.*;
import java.util.stream.Collectors;

public class PredicateParty_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> nameList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        Set<String> commands = new HashSet<>();

        while (!command.equals("Party!")){
            commands.add(command);
        }

            //foreach на командите
        //за всеки елемент правви предикат който е = на метод
        //в метода е логиката на предиката
        //премахвавме от namesList.apply(predicate)


            //взима командите и ги складира в сет
            //форийч на сета и прилага върху списъка
            //принтира резултата


    }
}
