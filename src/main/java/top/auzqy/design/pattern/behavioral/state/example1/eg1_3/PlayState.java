package top.auzqy.design.pattern.behavioral.state.example1.eg1_3;

/**
 * description:  正常播放
 * createTime: 2019-07-30 20:01
 * @author zqy
 */
public class PlayState extends VideoState {


    @Override
    void play() {
        System.out.println("正常播放视频");
    }

    @Override
    void speed() {
        videoContext.setVideoState(VideoContext.SPEED_STATE);
        videoContext.speed();
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
