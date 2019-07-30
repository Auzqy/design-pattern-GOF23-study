package top.auzqy.design.pattern.behavioral.state.example2;

/**
 * description:  傍晚工作状态
 * createTime: 2019-07-30 22:53
 * @author zqy
 */
public class EveningState extends WorkState {
    @Override
    void programming(Work work) {
        if (work.getHour() < 19  && work.getHour() >= 17) {
            System.out.println(
                    String.format("当前时间为: %s,快到晚饭时间了，有点饿了！—— 【 %s 】",
                            work.getHour(), work.getWorkState().getClass().getSimpleName()));
        }else { // 超过19点，转入加班工作状态
            work.setWorkState(new WorkOvertimeState());
            work.programming();
        }
    }
}
