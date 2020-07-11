package top.auzqy.design.pattern.behavioral.state.example3.eg3_1;

public enum State {
    /**
     * 小马里奥（Small Mario）
     */
    SMALL(0),
    /**
     * 超级马里奥（Super Mario）
     */
    SUPER(1),
    /**
     * 火焰马里奥（Fire Mario）
     */
    FIRE(2),
    /**
     * 斗篷马里奥（Cape Mario）
     */
    CAPE(3);

    private int value;
    State(int value) {    this.value = value;  }
    public int getValue() {    return this.value;  }
}