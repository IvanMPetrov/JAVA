package Exams_And_Preparations.Java_OOP.ChristmasPastryShop.repositories.interfaces;

import java.util.Collection;

public interface Repository<T> {



    Collection<T> getAll();

    void add(T t);

}
