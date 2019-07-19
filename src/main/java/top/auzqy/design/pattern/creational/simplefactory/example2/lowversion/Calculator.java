package top.auzqy.design.pattern.creational.simplefactory.example2.lowversion;

import lombok.extern.slf4j.Slf4j;

import java.io.Console;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Description: 低级版本的计算机功能的实现
 *
 *          todo 该程序的点评如下：
 *              1。 好处：
 *                  要求的功能基本完成
 *              2。 缺点：
 *                  2.1 仅仅是对当前需求做了实现
 *                  2.2 没有使用面向对象的程序设计思想
 *                  2.3 该代码 不容易维护，不容易扩展，不容易复用
 * @Author: zqy
 * @CreateTime: 2019-07-19 12:12
 */
@Slf4j
public class Calculator {
    public static void main(String[] args) {
        /*
            因为它实现 java.lang.AutoCloseable 这个接口，
            故使用 try-with-resource 形式
         */
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("请输入一个需要计算的数：");
            BigDecimal bigDecimal1 = scanner.nextBigDecimal();

            System.out.println("请输入另一个需要计算的数：");
            BigDecimal bigDecimal2 = scanner.nextBigDecimal();

            // todo 这里不能够使用 scanner.nextLine() 不知道为啥
            System.out.println("请输入操作运算符（+ - * / 中的一种）：");
            String operator = scanner.next();

            if ("+".equalsIgnoreCase(operator)) {
                log.info("计算机器显示：{} {} {} = {}",
                        bigDecimal1,
                        "+",
                        bigDecimal2,
                        bigDecimal1.add(bigDecimal2));
            }else if ("-".equalsIgnoreCase(operator)) {
                log.info("计算机器显示：{} {} {} = {}",
                        bigDecimal1,
                        "-",
                        bigDecimal2,
                        bigDecimal1.subtract(bigDecimal2));
            }else if ("*".equalsIgnoreCase(operator)) {
                log.info("计算机器显示：{} {} {} = {}",
                        bigDecimal1,
                        "*",
                        bigDecimal2,
                        bigDecimal1.multiply(bigDecimal2));
            }else if ("/".equalsIgnoreCase(operator)) {
                // 判断 如果除数为0 则不合法，决绝计算
                if (0 == bigDecimal2.intValue()) {
                    log.error("除数为0，计算不合法！");
                    return;
                }
                log.info("计算机器显示：{} {} {} = {}",
                        bigDecimal1,
                        "/",
                        bigDecimal2,
                        bigDecimal1
                                .divide(bigDecimal2,
                                        2,
                                        BigDecimal.ROUND_HALF_UP));
            }else {
                log.error("您输入的运算操作符不合法！");
            }
        }


    }
}
