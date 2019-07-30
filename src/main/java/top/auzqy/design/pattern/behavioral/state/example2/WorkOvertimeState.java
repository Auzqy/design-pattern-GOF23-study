package top.auzqy.design.pattern.behavioral.state.example2;

/**
 * description:  加班工作状态
 * createTime: 2019-07-30 22:53
 * @author zqy
 */
public class WorkOvertimeState extends WorkState {
    @Override
    void programming(Work work) {
        if (work.getHour() < 22 && work.getHour() >= 19) {
            System.out.println(
                    String.format("当前时间为: %s,领导不让下班，非给找点活！—— 【 %s 】",
                            work.getHour(), work.getWorkState().getClass().getSimpleName()));
        }else { // 超过22点，转入猝死工作状态
            work.setWorkState(new SuddenDeathState());
            work.programming();
        }
    }
}
