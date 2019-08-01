package top.auzqy.design.pattern.structural.flyweight.example2;

import java.util.Arrays;

/**
 * description:  黑棋
 * createTime: 2019-08-01 19:19
 * @author zqy
 */
public class BlackPiece implements Piece {
    @Override
    public void put() {
        System.out.println(color + "将棋子放到了" + Arrays.toString(position));
    }

    // 内部属性
    private static final String color = "黑手";

    // 外部属性
    private long[] position;


    public void setPosition(long[] position) {
        if (null == position || position.length != 2) {
            throw new RuntimeException("棋子位置输入错误");
        }
        this.position = position;
    }
}
