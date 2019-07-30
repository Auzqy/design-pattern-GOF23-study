
## 概述 

状态模式（State），


## 示例说明

### 1. example1
模拟观看电影时不同状态的切换 <br/>
观看电影时通常有如下状态: <br/>
1. 正常播放状态 <br/>
2. 倍速播放状态 <br/>
3. 暂停状态 <br/>
4. 停止状态 <br/>

eg1_1 在每个具体状态类下的操作 <br/>

```
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
```
    
eg1_2 在eg1_1的基础上，简化一下操作 todo <br/>


eg1_3 让 VideoState 持有 VideoContext 的引用 <br/>



### 2. example2 
模拟程序员一天中不同状态的切换 <br/>
工作时通常有如下状态: <br/>
1. 上午状态 <br/>
2. 中午状态 <br/>
3. 下午状态 <br/>
4. 傍晚状态 <br/>
5. 加班状态 <br/>
6. 猝死状态 <br/>


## 博客地址 
https://www.jianshu.com/p/9c0e505b43a8



