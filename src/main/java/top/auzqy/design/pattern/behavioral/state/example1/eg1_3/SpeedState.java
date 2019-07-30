package top.auzqy.design.pattern.behavioral.state.example1.eg1_3;

/**
 * description:  倍速播放
 * createTime: 2019-07-30 20:09
 * @author zqy
 */
public class SpeedState extends VideoState {

    @Override
    void play() {
        videoContext.setVideoState(VideoContext.PLAY_STATE);
        videoContext.play();
    }

    @Override
    void speed() {
        System.out.println("倍速播放视频");
    }

    @Override
    void pause() {
        videoContext.setVideoState(VideoContext.PAUSE_STATE);
        videoContext.pause();
    }

    @Override
    void stop() {
        videoContext.setVideoState(VideoContext.STOP_STATE);
        videoContext.stop();
    }
}
