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
}
