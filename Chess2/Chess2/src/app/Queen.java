package app;

/**
 * Queen
 */
class Queen extends Figures {
    public Queen(){
        name = "Q";
    }
    @Override
    public void keepMoveList(Board board) {
        // TODO Auto-generated method stub
        String keepString1;
        int keepX;
        int keepY;
        keepX = board.searchFigures(name);
        keepY = board.searchFigures(name);
        int keep;
        int keep2;
        String keepString;
        keep = board.searchFigures(name);
        keep2 = board.searchFigures(name);
        for (int j = 0; j < board.vectorList.size(); j++) {
            keepX -= 1;
            movingList.add(board.convertVectorToStringBoard(keepX));
            keepString1 = board.convertVectorToStringBoard(keepX);
            if (keepString1.indexOf("H") == 0 || keepX - 1 <= 0 || keepString1.indexOf("A") == 0)
                break;
        }
        for (int j = 0; j < board.vectorList.size(); j++) {
            keepString1 = board.convertVectorToStringBoard(keepY);
            if (keepString1.indexOf("H") == 0 || keepY + 1 <= 63 || keepString1.indexOf("A") == 0)
                break;
            keepY += 1;
            movingList.add(board.convertVectorToStringBoard(keepY));
        }
        for (int k = 0; k < board.vectorList.size(); k++) {
            keepY -= 8;
            movingList.add(board.convertVectorToStringBoard(keepY));
            keepString1 = board.convertVectorToStringBoard(keepY);
            if (keepY - 9 <= 0 || keepString1.indexOf("A") == 0)
                break;
        }
        for (int k = 0; k < board.vectorList.size(); k++) {
            keepString1 = board.convertVectorToStringBoard(keepY);
            if (keepY + 8 <= 63 || keepString1.indexOf("A") == 0)
                break;
            keepY += 8;
            movingList.add(board.convertVectorToStringBoard(keepY));
        }
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
