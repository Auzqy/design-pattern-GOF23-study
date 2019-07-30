package top.auzqy.design.pattern.behavioral.state.example1.eg1_1;

/**
 * description:  停止播放
 * createTime: 2019-07-30 20:09
 * @author zqy
 */
public class StopState extends VideoState{

    @Override
    void play(VideoContext videoContext) {
        videoContext.setVideoState(VideoContext.PLAY_STATE);
        videoContext.play();
    }

    @Override
    void speed(VideoContext videoContext) {
        videoContext.setVideoState(VideoContext.SPEED_STATE);
        videoContext.play();
    }

    @Override
    void pause(VideoContext videoContext) {
        System.out.println("Error !! 此时视频已经停止，无法暂停");
    }

    @Override
    void stop(VideoContext videoContext) {
        System.out.println("停止播放视频");
    }
}
