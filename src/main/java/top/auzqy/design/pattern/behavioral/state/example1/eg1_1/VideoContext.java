package top.auzqy.design.pattern.behavioral.state.example1.eg1_1;

/**
 * description:  视频上下文对象
 * createTime: 2019-07-30 20:02
 * @author zqy
 */
public class VideoContext {

    private VideoState videoState;

    final static PlayState PLAY_STATE = new PlayState();
    final static SpeedState SPEED_STATE = new SpeedState();
    final static PauseState PAUSE_STATE = new PauseState();
    final static StopState STOP_STATE = new StopState();

    public VideoContext(VideoState videoState) {
        this.videoState = videoState;
    }

    /**
     * 使用 set/get的话，可能会报空指针，不好
     * 改用构造方法
     *
     * 但是 set方法在此例中必须有，因为需要修改他的状态
     * @return
     */
    public VideoState getVideoState() {
        return videoState;
    }

    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
    }



    public void play(){
        this.videoState.play(this);
    }

    public void speed(){
        this.videoState.speed(this);
    }

    public void stop(){
        this.videoState.stop(this);
    }

    public void pause(){
        this.videoState.pause(this);
    }
}
