package Exams_And_Preparations.Java_OOP.ChristmasPastryShop;

import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.core.ControllerImpl;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.core.EngineImpl;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.core.interfaces.Controller;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.entities.booths.interfaces.Booth;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.entities.cocktails.interfaces.Cocktail;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.entities.delicacies.interfaces.Delicacy;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.io.ConsoleReader;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.io.ConsoleWriter;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.repositories.BoothRepositoryImpl;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.repositories.CocktailRepositoryImpl;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.repositories.DelicacyRepositoryImpl;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.repositories.interfaces.BoothRepository;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.repositories.interfaces.CocktailRepository;
import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.repositories.interfaces.DelicacyRepository;


public class Main {
    public static void main(String[] args) {

        String a = " ";
        int a1 = a.length();
        DelicacyRepository<Delicacy> delicacyRepository = new DelicacyRepositoryImpl();
        CocktailRepository<Cocktail> cocktailRepository = new CocktailRepositoryImpl();
        BoothRepository<Booth> boothRepository = new BoothRepositoryImpl();

        Controller controller = new ControllerImpl(delicacyRepository, cocktailRepository, boothRepository);

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        EngineImpl engine = new EngineImpl(reader, writer, controller);
        engine.run();
    }
}
