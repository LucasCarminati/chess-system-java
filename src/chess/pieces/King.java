package chess.pieces;

import chess.Color;

public class King extends chess.ChessPiece {
    public King(boardgame.Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
