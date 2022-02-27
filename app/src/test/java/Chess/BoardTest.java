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
        assertTrue(board.getPieceAt(0,0) instanceof Piece);
    }

    

    @Test void PieceAt0_4(){
        Board board = new Board();
        assertNotNull(board.getPieceAt(0,4));
    }

    @Test void noPieceAt4_0(){
        Board board = new Board();
        assertNull(board.getPieceAt(4, 0));
    }

    @Test void PieceAt7_7(){
        Board board = new Board();
        assertNotNull(board.getPieceAt(7, 7));
    }


    




}
