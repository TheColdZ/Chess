package Chess.Pieces;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RookTest {
    
    @Test void getNameTest(){
        Rook rook = new Rook(true);
        assertEquals("Rook", rook.getName());
    }

    @Test void rookCanMove(){
        Rook rook = new Rook(true);
        assertTrue(rook.canMoveToSquare(7, 0, 7, 7));
    }

    @Test void rookCannotMoveDiagonal(){
        Rook rook = new Rook(true);
        assertFalse(rook.canMoveToSquare(7, 0, 6, 1));
    }

    
}
