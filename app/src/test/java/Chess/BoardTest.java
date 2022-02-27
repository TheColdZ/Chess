package Chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BoardTest {
    @Test void BoardHasABoard(){
        Board board = new Board();
        assertNotNull(board.getBoard());
    }
    
    @Test void getPieceAtTest(){
        Board board = new Board();
        assertTrue(board.getPieceAt(0,0) instanceof PieceInterface);
    }

    

}
