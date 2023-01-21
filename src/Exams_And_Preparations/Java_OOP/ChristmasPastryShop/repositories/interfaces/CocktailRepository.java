package Exams_And_Preparations.Java_OOP.ChristmasPastryShop.repositories.interfaces;

public interface CocktailRepository<T> extends Repository<T> {
    T getByName(String name);
}
