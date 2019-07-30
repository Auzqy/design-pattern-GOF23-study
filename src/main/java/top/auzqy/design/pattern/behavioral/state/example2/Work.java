package top.auzqy.design.pattern.behavioral.state.example2;

import lombok.Data;

/**
 * description:  工作状态初始化
 * createTime: 2019-07-30 22:35
 *
 * @author zqy
 */
@Data
public class Work {

    private WorkState workState;

    private double hour;

    private boolean taskFinished;

    public Work() {
        this.workState = new MorningState();
    }

    public void programming(){
        this.workState.programming(this);
    }
}
