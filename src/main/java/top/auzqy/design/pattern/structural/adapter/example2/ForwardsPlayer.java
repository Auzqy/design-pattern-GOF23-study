package top.auzqy.design.pattern.structural.adapter.example2;

/**
 * @Description: 前锋运动员
 * @Author: zqy
 * @CreateTime: 2019-07-20 11:41
 */
public class ForwardsPlayer extends AbstractPlayer {

    public ForwardsPlayer(String playerName) {
        this.setPlayerName(playerName);
    }

    public ForwardsPlayer() {
    }

    @Override
    void attack() {
        System.out.println("前锋运动员【" + playerName + "】 进攻！");
    }

    @Override
    void defense() {
        System.out.println("前锋运动员【" + playerName + "】 防守！");
    }
}
