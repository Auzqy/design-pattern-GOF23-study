package top.auzqy.design.pattern.structural.adapter.example2;

/**
 * @Description: 适配器（充当的角色就是那个翻译）
 *
 *              这里用对象适配器方式
 * @Author: zqy
 * @CreateTime: 2019-07-20 12:10
 */
public class TranslatorAdapter extends AbstractPlayer{

    private ForeignCenterPlayer player = new ForeignCenterPlayer();

    public TranslatorAdapter() {
    }

    public TranslatorAdapter(String playerName) {
        player.setPlayerName(playerName);
    }

    @Override
    void attack() {
        player.attack();
        System.out.println("翻译官解说：【" + player.getPlayerName() + "】 进攻");
    }

    @Override
    void defense() {
        player.defense();
        System.out.println("翻译官解说：【" + player.getPlayerName() + "】 防守");
    }
}
