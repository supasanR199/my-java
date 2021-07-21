package app;
import java.util.ArrayList;
import java.util.List;
/**
 * Bord
 */
public class Board {
    private String[] colum = { "A", "B", "C", "D", "E", "F", "G", "H" };
    private String[] row = {"1","2","3","4","5","6","7","8"};
    ArrayList<String> succeedBord = new ArrayList<String>();
    ArrayList<Integer> vectorList = new ArrayList<>();
    ArrayList<String> playBoard = new ArrayList<>();
    public Board() {
        for(String r:row){
            for(String c:colum){
                succeedBord.add(c+r);
            }
        }
        for (int i = 0; i < 64; i++) {
            vectorList.add(i);
        }
        for (int i = 0; i < 64; i++) {
            playBoard.add("**");
        }
        
    }
    public void displayBord(List bordList) {
        int keep = -1;
        //System.out.println(succeedBord);
        //gennarate();
        for (int i = 0; i <= 7 ; i++) {
            System.out.printf("    %s    ",colum[i]);
        }
        System.out.println();
        for (int i = 1; i <= 8; i++) {
            System.out.printf("%d", i);
            for (int j = 0; j <= 7 ; j++) {
                if(j%8 == 0){
                    System.out.printf("\n");
                    System.out.print("\n");
                }
                keep++;
                System.out.printf("    %s   ",bordList.get(keep));
            }
            System.out.println();   
        }
        System.out.println();
    }

    public void freeMove(Figures aFigures,String position){
        aFigures.keepMoveList(Board.this);
        int index = searchFigures(aFigures);
        playBoard.remove(index);
        playBoard.add(index, "**");
        playBoard.remove(convertStringBoardtoVector(position));
        playBoard.add(convertStringBoardtoVector(position),aFigures.name);
    }
    public String convertVectorToStringBoard(int aInt) {
        String returnString;
        returnString = succeedBord.get(aInt);
        return returnString;
        
    }
    public int convertStringBoardtoVector(String aInt) {
        int returnString;
        returnString = succeedBord.indexOf(aInt);
        return returnString;
        
    }

    public void moveFigures(Figures aFigures,String position) {
        aFigures.keepMoveList(Board.this);
        if (aFigures.movingList.contains(position))
            freeMove(aFigures,position);
        else
            System.out.println("Can't not move this position");   
        }
    public int searchFigures(Figures aFigures) {
        int aInt = 0;
        for (int i = 0; i < playBoard.size(); i++) {
            if (aFigures.name == playBoard.get(i))
            aInt = i;
        }
        return aInt;
       
    }
    public int searchFigures(String aString) {
        int aInt = 0;
        for (int i = 0; i < playBoard.size(); i++) {
            if (aString == playBoard.get(i))
            aInt = i;
        }
        return aInt;
       
    }
    public void setFigures(Figures aFigures,String position) {
        playBoard.set(succeedBord.indexOf(position),aFigures.name);
    }
    
}

    


   
