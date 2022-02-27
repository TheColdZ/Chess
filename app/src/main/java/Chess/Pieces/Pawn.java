package Chess.Pieces;

import Chess.Piece;

public class Pawn implements Piece {
    private final String name;
    private final boolean colour; //true = white, false = black
    private boolean hasMoved;
    

    public Pawn(boolean colour){
        this.name = "Pawn";
        this.colour = colour;
        this.hasMoved = false; 
    }

    public String getName() {
        return name;
    }

    public boolean canMoveToSquare(int fromRow,int fromColumn, int toRow, int toColumn){
        if(!this.hasMoved){
            this.hasMoved = true;
            if (this.colour) {
                return (fromColumn == toColumn) && (fromRow - 2 <= toRow);
            }
            return (fromColumn == toColumn) && (fromRow + 2 >= toRow);
        }

        if (this.colour) {
            return (fromColumn == toColumn) && (fromRow - 1 == toRow);
        }
        return (fromColumn == toColumn) && (fromRow + 1 == toRow);
    }

    public boolean getColour(){
        return colour;
    }
}
