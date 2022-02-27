package Chess;

import Chess.Pieces.Pawn;

public class Board {

    private int[][] board; 

    public  Board() {
        this.board = new int[8][8]; 
    }

    public int[][] getBoard(){
        return this.board;
    }
    
    public PieceInterface getPieceAt(int column, int row){
        return new Pawn();
    }

}
