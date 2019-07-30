package top.auzqy.design.pattern.behavioral.state.example2;

/**
 * description:  中午工作状态
 * createTime: 2019-07-30 22:53
 * @author zqy
 */
public class NoonState extends WorkState {
    @Override
    void programming(Work work) {
        if (work.getHour() < 14  && work.getHour() >= 12) {
            System.out.println(
                    String.format("当前时间为: %s,刚吃饱，有点困！—— 【 %s 】",
                            work.getHour(), work.getWorkState().getClass().getSimpleName()));
        }else { // 超过14点，转入下午工作状态
            work.setWorkState(new AfterNoonState());
            work.programming();
        }
    }
}
