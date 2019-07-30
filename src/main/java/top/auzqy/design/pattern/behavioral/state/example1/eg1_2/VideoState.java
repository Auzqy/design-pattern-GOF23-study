package top.auzqy.design.pattern.behavioral.state.example1.eg1_2;

/**
 * description: 视频状态的抽象类
 * createTime: 2019-07-30 19:27
 *
 * @author zqy
 */
public abstract class VideoState {


    /**
     * 正常播放视频
     */
    abstract void play(VideoContext videoContext);

    /**
     * 加速播放视频
     */
    abstract void speed(VideoContext videoContext);

    /**
     * 暂停播放视频
     */
    abstract void pause(VideoContext videoContext);

    /**
     * 停止播放视频
     */
    abstract void stop(VideoContext videoContext);
}
