package top.auzqy.design.pattern.behavioral.state.example1.eg1_2;

/**
 * @Description: 模拟客户端的测试类
 * @Author: zqy
 * @CreateTime: 2019-07-30 18:39
 */
public class Test {

    public static void main(String[] args) {
        VideoContext videoContext = new VideoContext(new PlayState());

        videoContext.play();
        System.out.println("当前状态: " + videoContext.getVideoState().getClass().getSimpleName());
        System.out.println();

        videoContext.speed();
        System.out.println("当前状态: " + videoContext.getVideoState().getClass().getSimpleName());
        System.out.println();

        videoContext.pause();
        System.out.println("当前状态: " + videoContext.getVideoState().getClass().getSimpleName());
        System.out.println();

        videoContext.stop();
        System.out.println("当前状态: " + videoContext.getVideoState().getClass().getSimpleName());
        System.out.println();

        videoContext.pause();
        System.out.println("当前状态: " + videoContext.getVideoState().getClass().getSimpleName());
        System.out.println();
    }
}
