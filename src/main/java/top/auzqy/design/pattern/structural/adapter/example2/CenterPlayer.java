package top.auzqy.design.pattern.structural.adapter.example2;

/**
 * @Description: 中锋运动员
 * @Author: zqy
 * @CreateTime: 2019-07-20 11:41
 */
public class CenterPlayer extends AbstractPlayer {

    public CenterPlayer(String playerName) {
        this.setPlayerName(playerName);
    }

    public CenterPlayer() {
    }

    @Override
    void attack() {
        System.out.println("中锋运动员【" + getPlayerName() + "】 进攻！");
    }

    @Override
    void defense() {
        System.out.println("中锋运动员【" + getPlayerName() + "】 防守！");
    }
}
