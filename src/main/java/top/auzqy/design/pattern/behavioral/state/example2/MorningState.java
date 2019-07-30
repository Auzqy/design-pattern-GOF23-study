package top.auzqy.design.pattern.behavioral.state.example2;

/**
 * description:  上午状态
 * createTime: 2019-07-30 22:38
 * @author zqy
 */
public class MorningState extends WorkState {
    @Override
    void programming(Work work) {
        if (work.getHour() < 12 && work.getHour() >= 9) {
            System.out.println(
                    String.format("当前时间为: %s,精神状态很好，效率很高！—— 【 %s 】",
                            work.getHour(), work.getWorkState().getClass().getSimpleName()));
        }else { // 超过12点，转入中午工作状态
            work.setWorkState(new NoonState());
            work.programming();
        }
    }
}
