package Chess.Pieces;

import Chess.Piece;

public class Pawn implements Piece {
    private final String name;
    private final boolean colour; //true = white, false = black
    

    public Pawn(boolean colour){
        this.name = "Pawn";
        this.colour = colour; 
    }

    public String getName() {
        return name;
    }

    public boolean canMoveToSquare(int fromRow,int fromColumn, int toRow, int toColumn){
        if (this.colour) {
            return (fromColumn == toColumn) && (fromRow - 1 == toRow);
        }
        return (fromColumn == toColumn) && (fromRow + 1 == toRow);
    }

    public boolean getColour(){
        return colour;
    }
}
