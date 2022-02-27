package Chess;

import Chess.Pieces.Pawn;

public class Board {

    private Piece[][] board; 

    public  Board() {
        this.board = new Piece[8][8];
        
        for (int j = 0; j < 8; j++) {
            this.board[1][j] = new Pawn();
            this.board[6][j] = new Pawn();
        }
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
