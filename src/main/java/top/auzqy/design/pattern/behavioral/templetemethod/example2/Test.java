package top.auzqy.design.pattern.behavioral.templetemethod.example2;

/**
 * @Description: 测试类/客户端
 * @Author: zqy
 * @CreateTime: 2019-07-24 18:55
 */
public class Test {

    public static void main(String[] args) {
        AStorage elephant = new Elephant();
        elephant.storage();

        System.out.println();
        System.out.println("============");
        System.out.println();

        AStorage duck = new Duck();
        duck.storage();
    }
}
