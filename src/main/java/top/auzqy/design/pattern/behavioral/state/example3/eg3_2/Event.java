package top.auzqy.design.pattern.behavioral.state.example3.eg3_2;

public enum Event {
    /**
     *
     */
    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MET_MONSTER(3);
    private int value;
    Event(int value) {    this.value = value;  }
    public int getValue() {    return this.value;  }
}