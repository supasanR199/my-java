import java.util.Random;

/**
 * Dice
 */
public class Dice {
    private int[] fregs = new int[6];
    /**
     * @return the fregs
     */
    public int[] getFregs() {
        return fregs;
    }
    private static Random R = new Random();
    public int roll() {
        int face = R.nextInt(6) + 1;
        fregs[face-1] =+ 1;
        return face;
        
    }
}