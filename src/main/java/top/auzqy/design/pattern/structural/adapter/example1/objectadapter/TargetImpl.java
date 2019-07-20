package top.auzqy.design.pattern.structural.adapter.example1.objectadapter;

/**
 * @Description: 目标类
 *              example1 重点模拟第三条
 *
 *              1。如果在 姚明刚去NBA打球，不会外语，需要找翻译的例子中
 *                  本类代表的就是
 *                  【不会变的那帮说英语的人（NBA教练和球员）】；
 *              2。如果在 各国电压不同，用电产品需要适配 220V交流电的例子中
 *                  本类代表的就是
 *                  【我天朝大国的220V交流电】；
 *              3。如果在 请求接口不变（兼容老功能），想要调用新的功能的例子中
 *                  本类代表的就是将
 *                  【老的已经在线上跑着的接口】；
 * @Author: zqy
 * @CreateTime: 2019-07-19 23:54
 */
public class TargetImpl implements Target {
    @Override
    public void alreadyOnlineMethod() {
        System.out.println("当前线上正在运行的不可修改或者说需要兼容的程序！");
    }
}
