package chess;

import boardgame.Board;

public class ChessMatch {

    /*private int turn;
    private Color currentPlayer;
    private boolean check;
    private boolean checkMate;*/

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }
    public ChessPiece[][] getPieces() {
        ChessPiece [][] mat = new ChessPiece[board.getRows()][board.getColumn()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumn() ; j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);

            }
        }
        return mat;
    }


}
