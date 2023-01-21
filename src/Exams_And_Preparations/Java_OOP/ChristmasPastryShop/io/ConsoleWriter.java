package Exams_And_Preparations.Java_OOP.ChristmasPastryShop.io;

import Exams_And_Preparations.Java_OOP.ChristmasPastryShop.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    public void writeLine(String text) {
        System.out.println(text);
    }
}
