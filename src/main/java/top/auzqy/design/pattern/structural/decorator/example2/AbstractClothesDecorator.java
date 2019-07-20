package top.auzqy.design.pattern.structural.decorator.example2;

/**
 * @Description: 抽象的服饰装饰类
 * @Author: zqy
 * @CreateTime: 2019-07-20 23:23
 */
public abstract class AbstractClothesDecorator extends AbstractPeople{

    private AbstractPeople people;

    public AbstractClothesDecorator(AbstractPeople people) {
        this.people = people;
    }

    protected abstract void somethingForPrepare();

    @Override
    void show() {
        people.show();
    }
}
