package top.auzqy.design.pattern.creational.simplefactory.example2.highversion;

import java.util.Scanner;

/**
 * @Description: 计算器小功能调用的客户端测试类
 * @Author: zqy
 * @CreateTime: 2019-07-19 18:12
 */
public class Test {
    public static void main(String[] args) {
        methodCalculate();
    }

    /**
     * @Description: 使用静态工厂调用
     * @Author: zqy
     * @CreateTime: 2019-07-19 18:14
     */
    public static void methodCalculate() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("请输入操作运算符（+ - * / 中的一种）：");
            String operator = scanner.next();

            Calculate calculate = CalculateFactory.doCalculate(operator);

            System.out.println("请输入一个需要计算的数：");
            calculate.setBigDecimal1(scanner.nextBigDecimal());

            System.out.println("请输入另一个需要计算的数：");
            calculate.setBigDecimal2(scanner.nextBigDecimal());

//            log.info("计算机器显示：{} {} {} = {}",
//                    calculate.getBigDecimal1(),
//                    operator,
//                    calculate.getBigDecimal2(),
//                    calculate.doCalculate());
            System.out.println(
                    "计算机器显示：" +
                    calculate.getBigDecimal1() + " " +
                    operator + " " +
                    calculate.getBigDecimal2() + " = " +
                    calculate.doCalculate());
        }
    }

    /**
     * @Description: todo
     *          +   add
     *          -   subtract
     *          *   multiply
     *          /   divide
     *
     *          CalculateFactory.doCalculate(String className)
     *
     * @Author: zqy
     * @CreateTime: 2019-07-19 18:25
     */
    public static void reflectionCaluculate(){
//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println("请输入操作运算符（+ - * / 中的一种）：");
//            String operator = scanner.next();
//
//            Calculate calculate = CalculateFactory.doCalculate(operator);
//
//            System.out.println("请输入一个需要计算的数：");
//            calculate.setBigDecimal1(scanner.nextBigDecimal());
//
//            System.out.println("请输入另一个需要计算的数：");
//            calculate.setBigDecimal2(scanner.nextBigDecimal());
//
//            log.info("计算机器显示：{} {} {} = {}",
//                    calculate.getBigDecimal1(),
//                    operator,
//                    calculate.getBigDecimal2(),
//                    calculate.doCalculate());
//        }
    }
}
