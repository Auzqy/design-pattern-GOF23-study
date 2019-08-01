package top.auzqy.design.pattern.structural.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * description:  棋子工厂
 * createTime: 2019-08-01 19:25
 * @author zqy
 */
public class PieceFactory {
    private final static Map<String,Piece> PIECE_MAP= new HashMap<>();
    public final static String BLACK_PIECE = "black";
    public final static String WHITE_PIECE = "white";

    public static Piece getPiece(String color){
        Piece piece = PIECE_MAP.get(color);
        if (null == piece) {
            if (BLACK_PIECE.equalsIgnoreCase(color)) {
                piece = new BlackPiece();
            } else if (WHITE_PIECE.equalsIgnoreCase(color)) {
                piece = new WhitePiece();
            }
            PIECE_MAP.put(color, piece);
        }
        return piece;
    }
}
