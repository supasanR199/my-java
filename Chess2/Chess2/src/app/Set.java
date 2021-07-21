package app;

/**
 * Set
 */
public class Set {

    public static void set(Board board) {
        Bishop bs = new Bishop();
        King k = new King();
        Rook r = new Rook();
        Knight kn = new Knight();
        Pawn pa = new Pawn();
        Pawn pa1 = new Pawn();
        Pawn pa2 = new Pawn();
        Pawn pa3 = new Pawn();
        Pawn pa4 = new Pawn();
        Pawn pa5 = new Pawn();
        Pawn pa6 = new Pawn();
        Pawn pa7 = new Pawn();
        board.setFigures(k, "E8");
        board.setFigures(bs,"C8");
        board.setFigures(r, "H8");
        board.setFigures(kn, "G8");
        board.setFigures(pa, "H7");
        board.setFigures(pa1, "G7");
        board.setFigures(pa2, "F7");
        board.setFigures(pa3, "E7");
        board.setFigures(pa4, "D7");
        board.setFigures(pa5, "C7");
        board.setFigures(pa6, "B7");
        board.setFigures(pa7, "A7");
        pa.keepMoveList(board);
        System.out.println(pa.movingList);
        System.out.println();
        board.displayBord(board.playBoard);
        
    }
}