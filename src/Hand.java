import java.util.Random;

public class Hand {
    private Die[] dies = new Die[6];


    public void empty() {
        dies = new Die[6];
    }

    public int total() {
        int total = 0;
        for (Die die:dies
             ) {
            if(die != null) {
                total += die.getThrow();
            }
        }
        return total;
    }

    public float average() {
        return total() / dies.length;
    }

    public void throwDice() {
        for (Die die:dies) {
            if(die != null) {
                 die.throwDie();
            }
        }

    }

    public void showThrow() {
        System.out.println("*** Throw ***");
        for (Die die: dies) {
            if(die != null){
                printTrow(die);
            }
        }
    }

    private void printTrow(Die die)
    {
        System.out.println("Die: D"+die.getNumberOfSides()+" Result: "+die.getThrow()+"");
    }


    public void addDie() {
        Random rand = new Random();


        for (int i = 0; i < dies.length; i++) {
            if (dies[i] == null) {
                int sides  = rand.nextInt(32) + 1;
                dies[i] = new Die(sides);
            }
        }
    }
}
