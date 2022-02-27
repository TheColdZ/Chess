package Chess.Pieces;

import Chess.PieceInterface;

public class Pawn implements PieceInterface {
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
