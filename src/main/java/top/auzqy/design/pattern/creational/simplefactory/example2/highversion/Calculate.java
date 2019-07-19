package top.auzqy.design.pattern.creational.simplefactory.example2.highversion;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description: 用于计算的骨架
 * @Author: zqy
 * @CreateTime: 2019-07-19 17:47
 */
@Data
public abstract class Calculate {
    protected BigDecimal bigDecimal1;
    protected BigDecimal bigDecimal2;

    public abstract BigDecimal doCalculate();
}
