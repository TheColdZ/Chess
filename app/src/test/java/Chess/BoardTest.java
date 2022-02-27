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

    @Test void movePawn(){
        Board board = new Board();
        assertNotNull(board.getPieceAt(1, 0));
        board.movePiece(1,0,2,0);
        assertNotNull(board.getPieceAt(2, 0));
        assertNull(board.getPieceAt(1, 0));
    }

    @Test void illegalMoveOfPawn(){
        Board board = new Board();
        assertNotNull(board.getPieceAt(1, 0));
        board.movePiece(1,0,2,1);
        assertNull(board.getPieceAt(2, 1));
        assertNotNull(board.getPieceAt(1, 0));
    }


    




}
