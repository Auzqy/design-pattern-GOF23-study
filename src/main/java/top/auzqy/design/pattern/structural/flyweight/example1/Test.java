package top.auzqy.design.pattern.structural.flyweight.example1;

public class Test {
    private static final String departments[] = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            String department = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }

    /**
     * description:  测试一下享元模式在 Integer 中的应用
     * createTime: 2019-08-01 19:03
     *
     * @author zqy
     */
    public static void testInteger() {
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:" + (a == b));

        System.out.println("c==d:" + (c == d));
    }
}
