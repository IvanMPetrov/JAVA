package Exams_And_Preparations.Java_OOP.SpaceStation.models.planets;

import Exams_And_Preparations.Java_OOP.SpaceStation.models.planets.interfaces.Planet;

import java.util.Collection;
import java.util.LinkedList;

import static Exams_And_Preparations.Java_OOP.SpaceStation.common.ExceptionMessages.PLANET_NAME_NULL_OR_EMPTY;


public class PlanetImpl implements Planet {


    private String name;
    private Collection<String> items;



    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(PLANET_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public PlanetImpl(String name) {
        setName(name);
        this.items = new LinkedList<>();
    }

    @Override
    public Collection<String> getItems() {
        return this.items;
    }

    @Override
    public String getName() {
        return this.name;
    }


}
