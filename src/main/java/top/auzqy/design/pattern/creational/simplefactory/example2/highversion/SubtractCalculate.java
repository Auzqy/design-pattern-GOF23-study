package top.auzqy.design.pattern.creational.simplefactory.example2.highversion;

import java.math.BigDecimal;

/**
 * @Description: 减法计算
 * @Author: zqy
 * @CreateTime: 2019-07-19 17:53
 */
public class SubtractCalculate extends Calculate {
    @Override
    public BigDecimal doCalculate() {
        return bigDecimal1.subtract(bigDecimal2);
    }
}
