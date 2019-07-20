package top.auzqy.design.pattern.structural.decorator.example2;

/**
 * @Description:    女孩
 *              具体的被装饰类
 * @Author: zqy
 * @CreateTime: 2019-07-20 23:18
 */
public class Girl extends AbstractPeople {



    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void show() {
        System.out.println("女孩本身，当前啥都没穿！");
    }
}
