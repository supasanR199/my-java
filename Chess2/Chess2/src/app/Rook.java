package app;

/**
 * Rook
 */
class Rook extends Figures {
    public Rook() {
        name = "R";

    }

    @Override
    public void keepMoveList(Board board) {
        // TODO Auto-generated method stub
        String keepString;
        int keepX;
        int keepY;
        keepX = board.searchFigures(name);
        keepY = board.searchFigures(name);
        for (int j = 0; j < board.vectorList.size(); j++) {
            keepX -= 1;
            movingList.add(board.convertVectorToStringBoard(keepX));
            keepString = board.convertVectorToStringBoard(keepX);
            if (keepString.indexOf("H") == 0 || keepX - 1 <= 0 || keepString.indexOf("A") == 0)
                break;
        }
        for (int j = 0; j < board.vectorList.size(); j++) {
            keepString = board.convertVectorToStringBoard(keepY);
            if (keepString.indexOf("H") == 0 || keepY + 1 <= 63 || keepString.indexOf("A") == 0)
                break;
            keepY += 1;
            movingList.add(board.convertVectorToStringBoard(keepY));
        }
        for (int k = 0; k < board.vectorList.size(); k++) {
            keepY -= 8;
            movingList.add(board.convertVectorToStringBoard(keepY));
            keepString = board.convertVectorToStringBoard(keepY);
            if (keepY - 9 <= 0 || keepString.indexOf("A") == 0)
                break;
        }
        for (int k = 0; k < board.vectorList.size(); k++) {
            keepString = board.convertVectorToStringBoard(keepY);
            if (keepY + 8 <= 63 || keepString.indexOf("A") == 0)
                break;
            keepY += 8;
            movingList.add(board.convertVectorToStringBoard(keepY));
        }
    }

}