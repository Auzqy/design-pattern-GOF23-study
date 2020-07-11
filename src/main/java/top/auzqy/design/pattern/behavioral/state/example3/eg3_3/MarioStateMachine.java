package top.auzqy.design.pattern.behavioral.state.example3.eg3_3;

import top.auzqy.design.pattern.behavioral.state.example3.eg3_1.State;

public class MarioStateMachine {
  private int score;
  /**
   *  不再使用枚举来表示状态
    */
  private IMario currentState;

  public MarioStateMachine() {
    this.score = 0;
    this.currentState = new SmallMario(this);
  }

  public void obtainMushRoom() {
    this.currentState.obtainMushRoom();
  }

  public void obtainCape() {
    this.currentState.obtainCape();
  }

  public void obtainFireFlower() {
    this.currentState.obtainFireFlower();
  }

  public void meetMonster() {
    this.currentState.meetMonster();
  }

  public int getScore() {
    return this.score;
  }

  public State getCurrentState() {
    return this.currentState.getName();
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void setCurrentState(IMario currentState) {
    this.currentState = currentState;
  }
}
