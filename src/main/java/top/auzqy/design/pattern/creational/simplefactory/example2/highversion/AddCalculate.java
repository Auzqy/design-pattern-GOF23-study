package top.auzqy.design.pattern.creational.simplefactory.example2.highversion;

import java.math.BigDecimal;

/**
 * @Description: 加法运算
 * @Author: zqy
 * @CreateTime: 2019-07-19 17:51
 */
public class AddCalculate extends Calculate {

    @Override
    public BigDecimal doCalculate() {
        return bigDecimal1.add(bigDecimal2);
    }
}
