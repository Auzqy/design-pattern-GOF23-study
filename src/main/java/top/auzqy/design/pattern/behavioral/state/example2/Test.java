package top.auzqy.design.pattern.behavioral.state.example2;

/**
 * description:  客户端测试类
 *
 *              todo 注： 该代码有执行顺序的要求，仅做示例
 * createTime: 2019-07-30 22:46
 * @author zqy
 */
public class Test {
    public static void main(String[] args) {
        Work work = new Work();

        work.setHour(10);
        work.programming();
        System.out.println();

        work.setHour(13);
        work.programming();
        System.out.println();

        work.setHour(15);
        work.programming();
        System.out.println();

        work.setHour(18);
        work.programming();
        System.out.println();

        work.setHour(21);
        work.programming();
        System.out.println();

//        work.setHour(2);
//        work.programming();
//        System.out.println();


        work.setHour(6);
        work.programming();
        System.out.println();


        work.setHour(10);
        work.programming();
        System.out.println();

    }
}
