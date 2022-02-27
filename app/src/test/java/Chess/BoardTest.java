package Chess;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test void BoardHasABoard(){
        Board board = new Board();
        assertNotNull(board.getBoard());
    }
    
}
