package top.auzqy.design.pattern.behavioral.templetemethod.example2;

/**
 * @Description: 把大象装冰箱
 * @Author: zqy
 * @CreateTime: 2019-07-24 18:53
 */
public class Elephant extends AStorage {
    @Override
    protected void push() {
        System.out.println("把大象装冰箱");
    }
}
