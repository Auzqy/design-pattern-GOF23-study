package top.auzqy.design.pattern.behavioral.observer.example1;

/**
 * @Description: 测试类
 * @Author: zqy
 * @CreateTime: 2019-07-23 11:44
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("java视频课程");
        Teacher teacher1 = new Teacher("张三");
        Teacher teacher2 = new Teacher("李四");

        // 为被观察者添加观察者
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        // 业务逻辑相关的代码
        Question question = new Question();
        question.setUserName("a同学");
        question.setQuestionContent("java语言的三大特性都是什么");

        course.produceQuestion(course,question);
    }
}
