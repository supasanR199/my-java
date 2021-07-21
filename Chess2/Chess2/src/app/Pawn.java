package app;

/**
 * Pawn
 */
class Pawn extends Figures {
    public Pawn(){
        name = "Pa";
    }
    @Override
    public void keepMoveList(Board board) {
        // TODO Auto-generated method stub
        String aString;
        String keep = board.convertVectorToStringBoard(board.searchFigures(name)).substring(0,1);
        int keepInt = Integer.parseInt(board.convertVectorToStringBoard(board.searchFigures(name)).substring(1));
        // System.out.println(keepInt);
        // System.out.println(keep);
        keepInt -= 1;
         aString = keep + Integer.toString(keepInt); 
         movingList.add(aString);

    }
    
}