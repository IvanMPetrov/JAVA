package Java_Advance_Course.MapsAndAPI;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String> > mapCourse = new LinkedHashMap<>();
        Map<String, Integer> mapCount = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String name = input.split(" :")[1];

            if (!mapCourse.containsKey(course)){
                //създаваме курса и добавяме човека
                mapCourse.put(course,new ArrayList<>());
                mapCourse.get(course).add(name);
                mapCount.put(course,1);
            }else {
                //добавяме човека към курса който вече съществува
                mapCourse.get(course).add(name);
                int currentValue = mapCount.get(course);
                mapCount.put(course, currentValue + 1);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : mapCourse.entrySet()) {

            String productName = entry.getKey();//course

            int peopleNum = mapCount.get(productName);

            System.out.print(productName + ": " + peopleNum);
            System.out.printf("%n--%s%n",String.join("\n--",entry.getValue()));



        }


    }
}
