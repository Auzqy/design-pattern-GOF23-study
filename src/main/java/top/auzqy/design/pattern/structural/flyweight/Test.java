package top.auzqy.design.pattern.structural.flyweight;

public class Test {
    public static void main(String[] args){
//        test1();

        test2();
    }

    /**
     * 考察知识点:1.intern的作用;2.玩
     */
    private static void test2() {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1==str1.intern());
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2==str2.intern());
    }

    /**
     * 考察知识点:Integer缓存,equals和==
     */
    private static void test1() {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g ==(a+b));
        System.out.println(g.equals(a+b));
    }
}
