package top.auzqy.design.pattern.behavioral.command.example1;

/**
 * description:  视频类
 * createTime: 2019-08-04 14:28
 * @author zqy
 */
public class Video {
    private String videoName;

    public Video(String videoName) {
        this.videoName = videoName;
    }

    public void online(){
        System.out.println(this.videoName+"视频上线");
    }
    public void downLine(){
        System.out.println(this.videoName+"视频下线");
    }
}
