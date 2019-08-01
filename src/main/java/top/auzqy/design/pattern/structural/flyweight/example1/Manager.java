package top.auzqy.design.pattern.structural.flyweight.example1;

import lombok.Setter;

/**
 * description:  部门主管
 * createTime: 2019-08-01 18:55
 * @author zqy
 */
public class Manager implements Employee{
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    // 内部属性
    private String title = "研发部总监";

    // 外部属性
    private String department;

    @Setter
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }
}
