package Chess;
public interface Piece {
    public String getName();
    public boolean canMoveToSquare(int fromRow,int fromColumn,int toRow, int toColumn);
    public boolean getColour();

}
