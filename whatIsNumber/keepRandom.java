import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;


/**
 * keepRandom
 */
public class keepRandom {
    Random r = new Random();
    private List<Integer> keep_numberLisk = new ArrayList<Integer>();
    /**
     * @return the keep_numberLisk
     */
    public List<Integer> getKeep_numberLisk() {
        return keep_numberLisk;
    }
    public void keep_randomNumber(){
        for (int i = 0; i < 4; i++) {
            keep_numberLisk.add(r.nextInt(6));
        }
    }
    public void check_num(List s){
        List<String> show = new ArrayList<String>();
        List<String> show1 = new ArrayList<String>();
        List<Integer> keeList_Check = new ArrayList<Integer>();
        for (int i = 0; i < keep_numberLisk.size(); i++) {
            keeList_Check.add(keep_numberLisk.get(i));
        }
       for (int i = 0;i < keep_numberLisk.size();i++){
           if (s.get(i) == keep_numberLisk.get(i)){
               show.add(i,"*");
           }
           else{
               show.add(i,"x");
           }
       }
       s.retainAll(keeList_Check);
       System.out.println(show + " <-- Correct number and Correct location ");
       System.out.println(s + " <-- Correct number but not correct location ");
    }
}