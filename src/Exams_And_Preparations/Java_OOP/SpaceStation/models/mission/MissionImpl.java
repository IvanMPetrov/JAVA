package Exams_And_Preparations.Java_OOP.SpaceStation.models.mission;

import Exams_And_Preparations.Java_OOP.SpaceStation.models.astronauts.interfaces.Astronaut;
import Exams_And_Preparations.Java_OOP.SpaceStation.models.mission.interfaces.Mission;
import Exams_And_Preparations.Java_OOP.SpaceStation.models.planets.interfaces.Planet;

import java.util.Collection;

public class MissionImpl implements Mission {


    @Override
    public void explore(Planet planet, Collection<Astronaut> astronauts) {


        for (Astronaut astros : astronauts) {
            while (astros.getOxygen() > 0 && planet.getItems().iterator().hasNext()){

                    String currentPlanetItem = planet.getItems().iterator().next();
                    planet.getItems().remove(currentPlanetItem);

                    astros.getBag().getItems().add(currentPlanetItem);//asdasdasdas



                    astros.breath();

            }


        }

    }
}
