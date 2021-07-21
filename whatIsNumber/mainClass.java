import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * mainClass
 */
public class mainClass {

    public static void main(String[] args) {
        keepRandom aKeepRandom = new keepRandom();
        aKeepRandom.keep_randomNumber();
        Scanner sc = new Scanner(System.in);
        List<Integer> keepInput = new ArrayList<Integer>();
        do {
            keepInput.clear();
            System.out.print("Input your (4)number(0-6) : ");
               for (int i = 0; i < aKeepRandom.getKeep_numberLisk().size() ; i++) {
            keepInput.add(sc.nextInt());
            }
            System.out.println(keepInput);
            System.out.println("----------------------------------------------------------");
            // System.out.println(aKeepRandom.getKeep_numberLisk());
            aKeepRandom.check_num(keepInput);
        } while (keepInput.equals(aKeepRandom.getKeep_numberLisk())!=true);
        System.out.println("You win!!!");
    }

}