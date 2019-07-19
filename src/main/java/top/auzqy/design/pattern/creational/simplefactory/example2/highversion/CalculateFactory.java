package top.auzqy.design.pattern.creational.simplefactory.example2.highversion;

/**
 * @Description: 计算工厂
 *
 *          两种实现思路
 *              1。 静态方法，违反开闭原则
 *              2。 反射，相对来说遵守了开闭原则
 * @Author: zqy
 * @CreateTime: 2019-07-19 17:59
 */
public class CalculateFactory {


    /**
     * @Description: 静态方法，违反开闭原则
     * @Author: zqy
     * @CreateTime: 2019-07-19 18:06
     * @param operator  运算符
     * @return
     */
    public static Calculate doCalculate(String operator) {

        if ("+".equalsIgnoreCase(operator)) {
            return new AddCalculate();
        }else if ("-".equalsIgnoreCase(operator)) {
            return new SubtractCalculate();
        }else if ("*".equalsIgnoreCase(operator)) {
            return new MultiplyCalculate();
        }else if ("/".equalsIgnoreCase(operator)) {
            return new DivideCalculate();
        }else {
            throw new RuntimeException("您输入的运算操作符不合法！");
        }
    }

    /**
     * @Description: 使用反射，相对来说遵守了开闭原则
     *
     *              todo 这里如果运算符用符号的形式不好实现，
     *                  如果用规定好的字符的形式，
     *                  命名规则默认做个规定倒是可以反射比划一下！
     *                  意思明白就行了，有空在搞吧
     * @Author: zqy
     * @CreateTime: 2019-07-19 18:11
     * @param operatorClass 运算符的类
     * @return
     */
    public static Calculate doCalculate(Class operatorClass) {
        try {
            return (Calculate) Class.forName(operatorClass.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("发生 InstantiationException 异常，" + e );
        } catch (IllegalAccessException e) {
            System.out.println("发生 IllegalAccessException 异常，" + e );
        } catch (ClassNotFoundException e) {
            System.out.println("发生 ClassNotFoundException 异常，" + e );
        }
        throw new RuntimeException("您输入的运算操作符不合法！");
    }
}
