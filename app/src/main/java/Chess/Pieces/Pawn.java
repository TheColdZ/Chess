package Chess.Pieces;

import Chess.Piece;

public class Pawn implements Piece {
    private final String name;
    

    public Pawn(){
        this.name = "Pawn";

    }

    public String getName() {
        return name;
    }

    public int getMovement() {
        return 0;
    }

    public boolean canMoveToSquare(int fromRow,int fromColumn, int toRow, int toColumn){
        return (fromColumn == toColumn) && (fromRow + 1 == toRow);
    }
}
