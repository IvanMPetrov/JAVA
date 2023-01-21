package Java_OOP_Course.Abstractions_First_Lection.JediGalaxy;

public abstract class Being {

    protected int x;
    protected int y;

    public abstract void move();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}