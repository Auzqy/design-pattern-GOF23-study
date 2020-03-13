package top.auzqy.design.pattern.structural.proxy.example2;

//接口类
public interface FoodService {
    public void makeNoodle();
    public void makeChicken();
}

//实现接口
class FoodServiceImpl implements FoodService {
    @Override
    public void makeNoodle() {
        System.out.println("make noodle");
    }

    @Override
    public void makeChicken() {
        System.out.println("make Chicken");
    }
}