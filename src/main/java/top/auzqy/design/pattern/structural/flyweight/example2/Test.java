package top.auzqy.design.pattern.structural.flyweight.example2;

/**
 * description:  todo 感觉在其真正的使用方式上还是有疑惑
 * createTime: 2019-08-01 19:17
 * @author zqy
 */
public class Test {

    public static void main(String[] args) {
        long[] position;
        for(int i=0; i<10; i++){
            position = new long[]{(long)(Math.random() * 362),(long)(Math.random() * 362)};
            if (i % 2 == 0) {
                BlackPiece piece = (BlackPiece) PieceFactory.getPiece(PieceFactory.BLACK_PIECE);
                piece.setPosition(position);
                piece.put();
            }else {
                WhitePiece piece = (WhitePiece) PieceFactory.getPiece(PieceFactory.WHITE_PIECE);
                piece.setPosition(position);
                piece.put();
            }
        }
    }
}
