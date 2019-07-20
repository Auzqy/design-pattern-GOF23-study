package top.auzqy.design.pattern.structural.adapter.example2;

/**
 * @Description: 后卫运动员
 * @Author: zqy
 * @CreateTime: 2019-07-20 11:41
 */
public class GuardsPlayer extends AbstractPlayer {

    public GuardsPlayer(String playerName) {
        this.setPlayerName(playerName);
    }

    public GuardsPlayer() {
    }

    @Override
    void attack() {
        System.out.println("后卫运动员【" + playerName + "】 进攻！");
    }

    @Override
    void defense() {
        System.out.println("后卫运动员【" + playerName + "】 防守！");
    }
}
