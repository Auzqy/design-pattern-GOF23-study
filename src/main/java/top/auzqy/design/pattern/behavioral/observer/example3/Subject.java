package top.auzqy.design.pattern.behavioral.observer.example3;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Message message);
}