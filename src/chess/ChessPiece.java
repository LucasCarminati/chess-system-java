package chess;

import boardgame.Position;

public abstract class  ChessPiece extends boardgame.Piece {

    private Color color;

    public ChessPiece(boardgame.Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
