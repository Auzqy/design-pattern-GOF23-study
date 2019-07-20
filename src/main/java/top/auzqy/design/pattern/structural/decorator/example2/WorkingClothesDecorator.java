package top.auzqy.design.pattern.structural.decorator.example2;

/**
 * @Description: 具体的装饰者类
 * @Author: zqy
 * @CreateTime: 2019-07-20 23:35
 */
public class WorkingClothesDecorator extends AbstractClothesDecorator {

    public WorkingClothesDecorator(AbstractPeople people) {
        super(people);
    }

    @Override
    protected void somethingForPrepare() {
        System.out.println("早晨上好闹钟按时起床去上班");
    }

    @Override
    void show() {
        somethingForPrepare();
        super.show();
        System.out.println("穿上工服");
    }
}
