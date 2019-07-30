package top.auzqy.design.pattern.behavioral.state.example1.eg1_1;

/**
 * description:  倍速播放
 * createTime: 2019-07-30 20:09
 * @author zqy
 */
public class SpeedState extends VideoState{

    @Override
    void play(VideoContext videoContext) {
        videoContext.setVideoState(VideoContext.PLAY_STATE);
        videoContext.play();
    }

    @Override
    void speed(VideoContext videoContext) {
        System.out.println("倍速播放视频");
    }

    @Override
    void pause(VideoContext videoContext) {
        videoContext.setVideoState(VideoContext.PAUSE_STATE);
        videoContext.pause();
    }

    @Override
    void stop(VideoContext videoContext) {
        videoContext.setVideoState(VideoContext.STOP_STATE);
        videoContext.stop();
    }
}
