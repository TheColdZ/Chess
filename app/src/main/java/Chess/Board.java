package Chess;

import Chess.Pieces.Pawn;

public class Board {

    private Piece[][] board; 

    public  Board() {
        this.board = new Piece[8][8];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                this.board[i][j] = new Pawn();
            }
        }
        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < this.board[0].length; j++) {
                this.board[i][j] = new Pawn();
            }
            
        }

    }

    public Piece[][] getBoard(){
        return this.board;
    }
    
    public Piece getPieceAt(int row, int column){
        return this.board[row][column];
    }

}
