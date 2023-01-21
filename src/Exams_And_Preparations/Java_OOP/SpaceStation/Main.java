package Exams_And_Preparations.Java_OOP.SpaceStation;


import Exams_And_Preparations.Java_OOP.SpaceStation.core.ControllerImpl;
import Exams_And_Preparations.Java_OOP.SpaceStation.core.EngineImpl;
import Exams_And_Preparations.Java_OOP.SpaceStation.core.interfaces.Engine;


public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl(new ControllerImpl());
        engine.run();

    }
}
