package top.auzqy.design.pattern.behavioral.memento.example1.eg1_2;

public class Snapshot {
    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
