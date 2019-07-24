package top.auzqy.design.pattern.behavioral.templetemethod.example1;

/**
 * @Description: 测试类
 * @Author: zqy
 * @CreateTime: 2019-07-24 18:39
 */
public class Test {
    public static void main(String[] args) {
        ACourse GOF23Course = new GOF23Course();
        GOF23Course.makeCourse();

        System.out.println();
        System.out.println("============");
        System.out.println();

        ACourse feCourse1 = new FECourse(true);
        feCourse1.makeCourse();

        System.out.println();
        System.out.println("============");
        System.out.println();

        ACourse feCourse2 = new FECourse(false);
        feCourse2.makeCourse();
    }
}
