package top.auzqy.design.pattern.behavioral.observer.example2.eg2_2;

import com.google.common.eventbus.EventBus;

public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        Teacher teacher1 = new Teacher("Tonney");
        Teacher teacher2 = new Teacher("Jack");

        eventBus.register(teacher1);
        eventBus.register(teacher2);

        Course course = new Course("java");
        Question question1 = new Question();
        question1.setStudentName("a同学");
        question1.setQuestionContent("a问题");

        Question question2 = new Question();
        question2.setStudentName("b同学");
        question2.setQuestionContent("b问题");

        course.getQuestion().add(question1);
        course.getQuestion().add(question2);

        eventBus.post(course);
    }
}
