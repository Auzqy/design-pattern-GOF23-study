package top.auzqy.design.pattern.behavioral.state.example1.eg1_3;

/**
 * description: 视频状态的抽象类
 * createTime: 2019-07-30 19:27
 *
 * @author zqy
 */
public abstract class VideoState {

    protected VideoContext videoContext;

    public void setVideoContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

    /**
     * 正常播放视频
     */
    abstract void play();

    /**
     * 加速播放视频
     */
    abstract void speed();

    /**
     * 暂停播放视频
     */
    abstract void pause();

    /**
     * 停止播放视频
     */
    abstract void stop();
}
