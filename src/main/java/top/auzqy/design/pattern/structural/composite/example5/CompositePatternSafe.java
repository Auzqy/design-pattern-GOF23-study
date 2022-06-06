package top.auzqy.design.pattern.structural.composite.example5;

import java.util.ArrayList;

/**
 * <a href="http://c.biancheng.net/view/1373.html">http://c.biancheng.net/view/1373.html</a>
 * note: 安全式的组合模式的实现代码
 */
public class CompositePatternSafe {
    public static void main(String[] args) {
        CompositeSafe c0 = new CompositeSafe();
        CompositeSafe c1 = new CompositeSafe();
        ComponentSafe leaf1 = new LeafSafe("1");
        ComponentSafe leaf2 = new LeafSafe("2");
        ComponentSafe leaf3 = new LeafSafe("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
//抽象构件
interface ComponentSafe {
    public void operation();
}
//树叶构件
class LeafSafe implements ComponentSafe {
    private String name;
    public LeafSafe(String name) {
        this.name = name;
    }
    public void add(ComponentSafe c) {
    }
    public void remove(ComponentSafe c) {
    }
    public ComponentSafe getChild(int i) {
        return null;
    }
    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
//树枝构件
class CompositeSafe implements ComponentSafe {
    private ArrayList<ComponentSafe> children = new ArrayList<ComponentSafe>();
    public void add(ComponentSafe c) {
        children.add(c);
    }
    public void remove(ComponentSafe c) {
        children.remove(c);
    }
    public ComponentSafe getChild(int i) {
        return children.get(i);
    }
    public void operation() {
        for (Object obj : children) {
            ((ComponentSafe) obj).operation();
        }
    }
}