public class Hand {
    private Die[] dies = new Die[6];


    public void addDie(int sides) {
        for (int i = 0; i < dies.length; i++) {
            if (dies[i] == null) {
                dies[i] = new Die(sides);
            }
        }

    }
}
