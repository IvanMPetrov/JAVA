package Exams_And_Preparations.Java_OOP.Football.entities.field.interfaces;

import Exams_And_Preparations.Java_OOP.Football.entities.player.interfaces.Player;
import Exams_And_Preparations.Java_OOP.Football.entities.supplement.interfaces.Supplement;

import java.util.Collection;

public interface Field {
    int sumEnergy();

    void addPlayer(Player player);

    void removePlayer(Player player);

    void addSupplement(Supplement supplement);

    void drag();

    String getInfo();

    Collection<Player> getPlayers();

    Collection<Supplement> getSupplements();

    String getName();
}
