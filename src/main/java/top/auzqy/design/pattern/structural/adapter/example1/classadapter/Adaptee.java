package top.auzqy.design.pattern.structural.adapter.example1.classadapter;

/**
 * @Description: 被适配者类
 *              example1 重点模拟第三条
 *
 *              1。如果在 姚明刚去NBA打球，不会外语，需要找翻译的例子中
 *                  本类代表的就是
 *                  【姚明本人】；
 *              2。如果在 各国电压不同，用电产品需要适配 220V交流电的例子中
 *                  本类代表的就是
 *                  【电子产品】；
 *              3。如果在 请求接口不变（兼容老功能），想要调用新的功能的例子中
 *                  本类代表的就是
 *                  【将要被调用的新功能】；
 * @Author: zqy
 * @CreateTime: 2019-07-19 23:38
 */
public class Adaptee {

    public static void adapteeActualRequestMethod(){
        System.out.println("adaptee 中的方法，实际希望执行的方法");
    }
}
