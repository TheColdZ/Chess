package Chess;

public class Board {

    private int[][] board; 

    public  Board() {
        this.board = new int[8][8]; 
    }

    public int[][] getBoard(){
        return this.board;
    }
    
}
