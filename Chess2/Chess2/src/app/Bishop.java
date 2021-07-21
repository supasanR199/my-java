package app;

import java.util.jar.Attributes.Name;

/**
 * Bishop
 */
class Bishop extends Figures {
    public Bishop(){
        name = "BH";
    }
    public void keepMoveList(Board board) {
        int keep;
        int keep2;
        String keepString;
            keep = board.searchFigures(name);
            keep2 = board.searchFigures(name);
            for (int j = 0; j < board.vectorList.size(); j++) {
                keep -= 7;
                movingList.add(board.convertVectorToStringBoard(keep));
                keepString = board.convertVectorToStringBoard(keep);
                if (keepString.indexOf("H") == 0 || keep - 7 <= 0 || keepString.indexOf("A") == 0) 
                break;
            }
            for (int k = 0; k < board.vectorList.size(); k++) {
            keep2 -= 9;
            movingList.add(board.convertVectorToStringBoard(keep2));
            keepString = board.convertVectorToStringBoard(keep2);
            if (keep2 - 9 <= 0 || keepString.indexOf("A") == 0) 
            break;
            }
            for (int j = 0; j < board.vectorList.size(); j++) {
                keep += 7;
                movingList.add(board.convertVectorToStringBoard(keep));
                keepString = board.convertVectorToStringBoard(keep);
                if (keepString.indexOf("H") == 0 || keep + 7 <= 63 || keepString.indexOf("A") == 0) 
                break;        
            }
            for (int k = 0; k < board.vectorList.size(); k++) {
                keep2 += 9;
                movingList.add(board.convertVectorToStringBoard(keep2));
                keepString = board.convertVectorToStringBoard(keep2);
                if (keep2 + 9 <= 63 || keepString.indexOf("A") == 0) 
                break;
                }

    }      
}
            
