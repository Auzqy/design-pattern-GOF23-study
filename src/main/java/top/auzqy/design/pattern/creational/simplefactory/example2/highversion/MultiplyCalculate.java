package top.auzqy.design.pattern.creational.simplefactory.example2.highversion;

import java.math.BigDecimal;

/**
 * @Description: 乘法计算
 * @Author: zqy
 * @CreateTime: 2019-07-19 17:54
 */
public class MultiplyCalculate extends Calculate {
    @Override
    public BigDecimal doCalculate() {
        return bigDecimal1.multiply(bigDecimal2);
    }
}
