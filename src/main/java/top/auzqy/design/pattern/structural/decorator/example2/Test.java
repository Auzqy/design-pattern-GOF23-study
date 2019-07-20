package top.auzqy.design.pattern.structural.decorator.example2;

/**
 * @Description: 测试类
 * @Author: zqy
 * @CreateTime: 2019-07-20 23:37
 */
public class Test {

    public static void main(String[] args) {
        AbstractPeople girl = new Girl("漂亮小姐姐",23);

        // 穿上工作服去上班
        System.out.println("========== 情景模拟一 =========");
        AbstractClothesDecorator girlOnWorkDayDecorator =
                new WorkingClothesDecorator(girl);
        girlOnWorkDayDecorator.show();
        System.out.println();

        System.out.println("========== 情景模拟二 =========");
        // 穿上晚礼服去参加舞会
        AbstractClothesDecorator girlOnWeekendDecorator =
                new EveningDressDecorator(girl);
        girlOnWeekendDecorator.show();
        System.out.println();

        // 小姐姐心情不好，今天想抽风
        System.out.println("========== 情景模拟三 =========");
        AbstractClothesDecorator girlCrazyDecorator =
                new EveningDressDecorator(girl);
        girlCrazyDecorator =
                new WorkingClothesDecorator(girlCrazyDecorator);
        girlCrazyDecorator.show();
    }
}
