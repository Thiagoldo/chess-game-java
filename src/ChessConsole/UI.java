package ChessConsole;

import chess.ChessMatch;
import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces){
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8-i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                if (pieces[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.println(pieces[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
}
