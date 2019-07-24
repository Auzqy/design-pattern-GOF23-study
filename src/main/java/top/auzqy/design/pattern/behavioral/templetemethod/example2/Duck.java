package top.auzqy.design.pattern.behavioral.templetemethod.example2;

/**
 * @Description: 把鸭子装冰箱
 * @Author: zqy
 * @CreateTime: 2019-07-24 18:54
 */
public class Duck extends AStorage {
    @Override
    protected void push() {
        System.out.println("把鸭子装冰箱");
    }
}
