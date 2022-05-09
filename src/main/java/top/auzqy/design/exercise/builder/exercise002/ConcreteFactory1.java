package top.auzqy.design.exercise.builder.exercise002;

class ConcreteFactory1 implements AbstractFactory {
    public Product newProduct1() {
        System.out.println("具体工厂 1 生成-->具体产品 11...");
        return new ConcreteProduct1();
    }
    public Product newProduct2() {
        System.out.println("具体工厂 1 生成-->具体产品 21...");
        return new ConcreteProduct2();
    }
}