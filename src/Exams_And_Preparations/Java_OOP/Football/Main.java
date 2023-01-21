package Exams_And_Preparations.Java_OOP.Football;

import Exams_And_Preparations.Java_OOP.Football.core.EngineImpl;
import Exams_And_Preparations.Java_OOP.Football.core.interfaces.Engine;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
