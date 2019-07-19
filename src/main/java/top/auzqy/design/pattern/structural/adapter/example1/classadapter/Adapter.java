package top.auzqy.design.pattern.structural.adapter.example1.classadapter;

/**
 * @Description: 目标类
 *              example1 重点模拟第三条
 *
 *              1。如果在 姚明刚去NBA打球，不会外语，需要找翻译的例子中
 *                  本类代表的就是
 *                  【翻译】；
 *              2。如果在 各国电压不同，用电产品需要适配 220V交流电的例子中
 *                  本类代表的就是
 *                  【适配器本人（也叫变压器）】；
 *              3。如果在 请求接口不变（兼容老功能），想要调用新的功能的例子中
 *                  本类代表的就是将
 *                  【适配器类】；
 * @Author: zqy
 * @CreateTime: 2019-07-19 23:57
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void alreadyOnlineMethod() {
        // 适配器可以为其真正想执行的方法添加一些逻辑，如果有需要的话
        Adaptee.adapteeActualRequestMethod();
    }
}
