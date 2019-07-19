package top.auzqy.design.pattern.creational.simplefactory.example2.highversion;

import java.math.BigDecimal;

/**
 * @Description: 除法计算
 * @Author: zqy
 * @CreateTime: 2019-07-19 17:55
 */
public class DivideCalculate extends Calculate {
    @Override
    public BigDecimal doCalculate() {
        if (0 == bigDecimal2.intValue()) {
            throw new RuntimeException("除数不能为0，请验证后再输入！");
        }
        return bigDecimal1.divide(bigDecimal2,2,BigDecimal.ROUND_HALF_UP);
    }
}
