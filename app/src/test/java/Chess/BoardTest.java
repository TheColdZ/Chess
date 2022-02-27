package Chess;

import org.junit.jupiter.api.Test;
import Chess.Pieces.Rook;

import static org.junit.jupiter.api.Assertions.*;


class BoardTest {
    @Test void BoardHasABoard(){
        Board board = new Board();
        assertNotNull(board.getBoard());
    }
    
    @Test void getPieceAtTest(){
        Board board = new Board();
        assertTrue(board.getPieceAt(1,1) instanceof Piece);
    }

    

    @Test void PieceAt1_4(){
        Board board = new Board();
        assertNotNull(board.getPieceAt(1,4));
    }

    @Test void noPieceAt4_0(){
        Board board = new Board();
        assertNull(board.getPieceAt(4, 0));
    }


    @Test void PieceAt6_6(){
        Board board = new Board();
        assertNotNull(board.getPieceAt(6, 6));
    }

    @Test void movePawn(){
        Board board = new Board();
        assertNotNull(board.getPieceAt(1, 0));
        board.movePiece(1,0,2,0);
        assertNotNull(board.getPieceAt(2, 0));
        assertNull(board.getPieceAt(1, 0));
    }

    @Test void illegalMoveOfPawn1_0To2_1(){
        Board board = new Board();
        assertNotNull(board.getPieceAt(1, 0));
        board.movePiece(1,0,2,1);
        assertNull(board.getPieceAt(2, 1));
        assertNotNull(board.getPieceAt(1, 0));
    }

    @Test void firstPawnMoveCanBe2(){
        Board board = new Board();
        board.movePiece(6, 0, 4, 0);
        assertNotNull(board.getPieceAt(4, 0));

    }

    @Test void secondMoveOfPawnCannotBe2(){
        Board board = new Board();
        board.movePiece(6, 0, 5, 0);
        board.movePiece(5, 0, 3, 0);
        assertNull(board.getPieceAt(3, 0));
    }

    @Test void getRookAtCorners(){
        Board board = new Board();
        Rook rook = new Rook(true);
        assertTrue(board.getPieceAt(0,0).getClass() == rook.getClass() );
        assertTrue(board.getPieceAt(0,7).getClass() == rook.getClass() );
        assertTrue(board.getPieceAt(7,0).getClass() == rook.getClass() );
        assertTrue(board.getPieceAt(7,7).getClass() == rook.getClass() );
    }

    @Test void rookCannotMoveOntoAPiece(){
        Board board = new Board();
        Rook rook = (Rook) board.getPieceAt(7,0);
        assertFalse(board.checkLegalMove(rook, 7,0, 5, 0));

    }

    




}
