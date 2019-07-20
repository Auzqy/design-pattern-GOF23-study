package top.auzqy.design.pattern.structural.decorator.example2;

import lombok.Data;

/**
 * @Description:    人类
 *
 *              抽象的被装饰者
 * @Author: zqy
 * @CreateTime: 2019-07-20 23:14
 */
@Data
public abstract class AbstractPeople {
    protected String name;
    protected int age;

    abstract void show();
}
