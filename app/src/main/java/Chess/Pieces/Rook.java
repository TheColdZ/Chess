package Chess.Pieces;

import Chess.Piece;

public class Rook implements Piece {
    private final String name;
    private final boolean colour; //true = white, false = black

    public Rook(boolean colour){
        this.name = "Rook";
        this.colour = colour;
    }

    public String getName() {
        return this.name;
    }

    public boolean canMoveToSquare(int fromRow, int fromColumn, int toRow, int toColumn) {
        return (fromRow == toRow || fromColumn == toColumn);
    }

    public boolean getColour() {
        return this.colour;
    }
    
}
