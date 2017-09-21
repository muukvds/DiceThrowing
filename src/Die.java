import java.util.Random;

public class Die {
    private int numberOfSides;
    private int lastThrow = 0;

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

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
        lastThrow = rand.nextInt(numberOfSides) + 1;
    }
}
