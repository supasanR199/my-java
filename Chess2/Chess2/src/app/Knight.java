package app;

/**
 * Knight
 */
class Knight extends Figures {
    public Knight(){
        name = "KN";
    }

    @Override
    public void keepMoveList(Board board) {
        if (board.convertVectorToStringBoard(board.searchFigures(name)).contains("8") && board.searchFigures(name) + 4 > 63) {
            movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) - 15));
            movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) - 17));
             movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) - 10));
            // movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) - 17));
        }

    }

}