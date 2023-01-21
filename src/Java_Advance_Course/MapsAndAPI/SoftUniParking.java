package Java_Advance_Course.MapsAndAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Map<String,String> map = new LinkedHashMap<>();


        for (int i = 0; i < num ; i++) {

            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String name = input.split(" ")[1];

            if (command.equals("register")){
                //проверка дали го има регистриран
                String number = input.split(" ")[2];
                if (!map.containsKey(name)){
                    //в случай че го няма регистрираш
                    map.put(name,number);
                    //sout регистриран
                    System.out.printf("%s registered %s successfully%n",name,number);
                }else {
                    //в случай че го има already registered
                    System.out.printf("ERROR: already registered with plate number %s%n",map.get(name));
                }

            }else if (command.equals("unregister")){
                //проверка дали го има регистриран
                if (map.containsKey(name)){
                    System.out.printf("%s unregistered successfully%n",name);
                    map.remove(name);
                }else {
                    System.out.printf("ERROR: user %s not found%n",name);
                }
                //ако го има премахваме
                //ако го няма not found
            }
        }

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));//John => CS1234JS
    }
}
