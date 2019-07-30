package top.auzqy.design.pattern.behavioral.state.example2;

/**
 * description:  下午工作状态
 * createTime: 2019-07-30 22:53
 * @author zqy
 */
public class AfterNoonState extends WorkState {
    @Override
    void programming(Work work) {
        if (work.getHour() < 17  && work.getHour() >= 14) {
            System.out.println(
                    String.format("当前时间为: %s,中午没睡，有点疲倦，效率不高！—— 【 %s 】",
                            work.getHour(), work.getWorkState().getClass().getSimpleName()));
        }else { // 超过17点，转入傍晚工作状态
            work.setWorkState(new EveningState());
            work.programming();
        }
    }
}
