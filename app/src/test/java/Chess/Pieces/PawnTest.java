package Chess.Pieces;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PawnTest {

    @Test void getNameTest(){
        Pawn pawn = new Pawn();
        assertEquals("Pawn", pawn.getName());
    }

    @Test void getMovement(){
        Pawn pawn = new Pawn();
        assertEquals(0, pawn.getMovement());
    }

    
}
