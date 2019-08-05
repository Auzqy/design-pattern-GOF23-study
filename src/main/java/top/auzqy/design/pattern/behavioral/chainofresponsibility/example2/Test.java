package top.auzqy.design.pattern.behavioral.chainofresponsibility.example2;

public class Test {
    public static void main(String[] args) {
        Salary salary = new Salary(2500);

        Boss boss = new Boss();
        HR hr = new HR();
        DepartmentManager departmentManager = new DepartmentManager();

        departmentManager.setNextLeader(hr);
        hr.setNextLeader(boss);

        departmentManager.approve(salary);
    }
}
