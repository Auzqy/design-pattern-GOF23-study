package top.auzqy.design.pattern.structural.adapter.example4;


interface ITarget {
    void f1();

    void f2();

    void fc();
}

class Adaptee {
    public void fa() {
        //...
    }
    public void fb() {
        //...
    }
    public void fc() {
        //...
    }
}

/**
 * 类适配器: 基于继承
 */
public class Adaptor extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        //...重新实现f2()...
    }

    // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
}

/**
 * 对象适配器：基于组合
  */
class Adaptor2 implements ITarget {
    private Adaptee adaptee;

    public Adaptor2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        // 委托给 Adaptee
        adaptee.fa();
    }

    @Override
    public void f2() {
        //...重新实现f2()...
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}
