package Java_OOP_Course.Abstractions_First_Lection.JediGalaxy;

public class Evil extends Being{

    @Override
    public void move() {
        x--;
        y++;
    }
}