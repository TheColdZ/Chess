package Chess.Pieces;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PawnTest {

    @Test void getNameTest(){
        Pawn pawn = new Pawn(true);
        assertEquals("Pawn", pawn.getName());
    }

    @Test void pawnCanMove(){
        Pawn pawn = new Pawn(false);
        assertTrue(pawn.canMoveToSquare(1,0,2,0));
    } 

    @Test void getColour(){
        Pawn pawn = new Pawn(true);
        assertTrue(pawn.getColour());
    }

    @Test void blackPawnMovesDown(){
        Pawn pawn = new Pawn(false);
        assertTrue(pawn.canMoveToSquare(1, 0, 2, 0));
    }

    
    @Test void whitePawnMovesUp(){
        Pawn pawn = new Pawn(true);
        assertTrue(pawn.canMoveToSquare(6, 0, 5, 0));
    }



}
