package top.auzqy.design.pattern.behavioral.state.example1.eg1_1;

/**
 * description:  暂停播放
 * createTime: 2019-07-30 20:09
 * @author zqy
 */
public class PauseState extends VideoState{

    @Override
    void play(VideoContext videoContext) {
        videoContext.setVideoState(VideoContext.PLAY_STATE);
        videoContext.play(); // 具体在该状态下的操作
    }

    @Override
    void speed(VideoContext videoContext) {
        videoContext.setVideoState(VideoContext.SPEED_STATE);
        videoContext.speed();
    }

    @Override
    void pause(VideoContext videoContext) {
        System.out.println("暂停播放视频");
    }

    @Override
    void stop(VideoContext videoContext) {
        videoContext.setVideoState(VideoContext.STOP_STATE);
        videoContext.stop();
    }
}
