package top.auzqy.design.pattern.structural.adapter.example3;

/**
 * @Description: 国家标准 220V的交流电
 *
 *              需要被适配的对象
 * @Author: zqy
 * @CreateTime: 2019-07-20 16:52
 */
public class AC220 {

    public void service(){
        System.out.println("国家输入的标准的 220V 交流电");
    }
}
