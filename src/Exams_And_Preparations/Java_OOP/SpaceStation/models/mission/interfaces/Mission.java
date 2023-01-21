package Exams_And_Preparations.Java_OOP.SpaceStation.models.mission.interfaces;

import Exams_And_Preparations.Java_OOP.SpaceStation.models.astronauts.interfaces.Astronaut;
import Exams_And_Preparations.Java_OOP.SpaceStation.models.planets.interfaces.Planet;

import java.util.Collection;

public interface Mission {
    void explore(Planet planet, Collection<Astronaut> astronauts);
}
