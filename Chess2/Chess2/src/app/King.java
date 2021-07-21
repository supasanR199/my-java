package app;

import javax.swing.border.Border;

/**
 * King
 */
class King extends Figures { 
    public King(){
        name = "K";
    }

    @Override
    public void keepMoveList(Board board) {
        if (board.searchFigures(name) + 7 >= 63 || board.searchFigures(name) + 8 >= 63 || board.searchFigures(name) + 9 >= 63) {
        }
        else{
            movingList.add(board.convertVectorToStringBoard(board.searchFigures(name)+7));
            movingList.add(board.convertVectorToStringBoard(board.searchFigures(name)+8));
            movingList.add(board.convertVectorToStringBoard(board.searchFigures(name)+9));
        }
        if (board.convertVectorToStringBoard(board.searchFigures(name)).contains("H")) {
            movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) - 1));
        } else if (board.convertVectorToStringBoard(board.searchFigures(name)).contains("A")) {
            movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) + 1));
        } else {
            movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) + 1));
            movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) - 1));
        }
        movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) - 7));
        movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) - 8));
        movingList.add(board.convertVectorToStringBoard(board.searchFigures(name) - 9));
        //movingList.add(board.covertVectorToStringBoard(board.searchFigures(name)));


    }
    
    
}