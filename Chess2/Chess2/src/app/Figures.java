package app;

/**
 * Figures
 */

import java.util.ArrayList;
import java.util.List;


abstract class Figures {
    ArrayList<Integer> positionList = new ArrayList<>();
    ArrayList<String> movingList = new ArrayList<>();
    public String name;
    public Figures (){
    }
    abstract public void keepMoveList(Board board);
}