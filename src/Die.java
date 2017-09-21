import java.util.Random;

public class Die {
    private int numberOfSides;
    private int lastThrow;


    public void setNumberOfSides(int sides) {
        numberOfSides = sides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int getThrow() {
        return lastThrow;
    }

    public void throwDie()
    {
        Random rand = new Random();
        lastThrow = rand.nextInt(50) + 1;
    }
}
