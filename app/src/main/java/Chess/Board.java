package Chess;

import Chess.Pieces.*;

public class Board {

    private Piece[][] board; 

    public  Board() {
        this.board = new Piece[8][8];
        
        for (int j = 0; j < 8; j++) {
            this.board[1][j] = new Pawn(false);
            this.board[6][j] = new Pawn(true);
        }
        this.board[0][0] = new Rook(false);
        this.board[0][7] = new Rook(false);

        this.board[7][0] = new Rook(true);
        this.board[7][7] = new Rook(true);
        
    }

    public Piece[][] getBoard(){
        return this.board;
    }
    
    public Piece getPieceAt(int row, int column){
        return this.board[row][column];
    }

    public void movePiece(int fromRow, int fromColumn, int toRow, int toColumn){
        Piece pieceToMove = getPieceAt(fromRow, fromColumn); 
        if(checkLegalMove(pieceToMove,fromRow,fromColumn,toRow,toColumn)){
            this.board[fromRow][fromColumn] = null;
            this.board[toRow][toColumn] = pieceToMove;
        }
    }

    public boolean checkLegalMove(Piece pieceToCheck,int fromRow,int fromColumn, int toRow, int toColumn){
        return pieceToCheck.canMoveToSquare(fromRow,fromColumn,toRow,toColumn);
    }


}
