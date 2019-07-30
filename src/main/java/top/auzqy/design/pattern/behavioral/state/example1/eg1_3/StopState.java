package top.auzqy.design.pattern.behavioral.state.example1.eg1_3;

/**
 * description:  停止播放
 * createTime: 2019-07-30 20:09
 * @author zqy
 */
public class StopState extends VideoState {

    @Override
    void play() {
        videoContext.setVideoState(VideoContext.PLAY_STATE);
        videoContext.play();
    }

    @Override
    void speed() {
        videoContext.setVideoState(VideoContext.SPEED_STATE);
        videoContext.play();
    }

    @Override
    void pause() {
        System.out.println("Error !! 此时视频已经停止，无法暂停");
    }

    @Override
    void stop() {
        System.out.println("停止播放视频");
    }
}
