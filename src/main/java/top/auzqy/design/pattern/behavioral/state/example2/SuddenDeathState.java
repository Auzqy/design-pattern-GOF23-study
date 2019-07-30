package top.auzqy.design.pattern.behavioral.state.example2;

/**
 * description:  猝死工作状态
 * createTime: 2019-07-30 22:53
 * @author zqy
 */
public class SuddenDeathState extends WorkState {
    @Override
    void programming(Work work) {
        if ((work.getHour() < 24  && work.getHour() >= 22)
                || (work.getHour() < 4  && work.getHour() >= 0)){
            System.out.println(
                    String.format("当前时间为: %s,要猝死了！—— 【 %s 】",
                            work.getHour(), work.getWorkState().getClass().getSimpleName()));
        }else { // 超过4点，转入下午工作状态
            System.out.println("人已猝死！");
        }
    }
}
