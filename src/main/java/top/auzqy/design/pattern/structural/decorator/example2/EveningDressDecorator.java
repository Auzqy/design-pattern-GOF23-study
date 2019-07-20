package top.auzqy.design.pattern.structural.decorator.example2;

/**
 * @Description: 具体的装饰者类
 * @Author: zqy
 * @CreateTime: 2019-07-20 23:30
 */
public class EveningDressDecorator extends AbstractClothesDecorator {


    public EveningDressDecorator(AbstractPeople people) {
        super(people);
    }

    @Override
    protected void somethingForPrepare() {
        System.out.println("下班赶快回家，晚上有个重要的舞会哦！");
    }

    @Override
    void show() {
        somethingForPrepare();
        super.show();
        System.out.println("穿上我漂亮的晚礼服");
    }
}
