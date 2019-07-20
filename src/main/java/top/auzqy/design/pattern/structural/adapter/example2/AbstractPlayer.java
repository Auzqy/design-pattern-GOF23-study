package top.auzqy.design.pattern.structural.adapter.example2;

import lombok.Data;

/**
 * @Description: 抽象的运动员类
 * @Author: zqy
 * @CreateTime: 2019-07-20 11:37
 */
@Data
public abstract class AbstractPlayer {
    protected String playerName;

    abstract void attack();
    abstract void defense();
}
