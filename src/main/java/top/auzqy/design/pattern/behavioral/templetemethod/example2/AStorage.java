package top.auzqy.design.pattern.behavioral.templetemethod.example2;

/**
 * @Description: 模拟存储的抽象类
 *
 *              这里只模拟放到冰箱里，不再对存储容器做抽象了
 * @Author: zqy
 * @CreateTime: 2019-07-24 18:47
 */
public abstract class AStorage {

    protected final void storage(){
        openRefrigerator();
        push();
        closeRefrigerator();
    }

    private void openRefrigerator(){
        System.out.println("打开冰箱门");
    }

    protected abstract void push();

    private void closeRefrigerator(){
        System.out.println("关上冰箱门");
    }
}
