package top.auzqy.design.pattern.behavioral.state.example3.eg3_3;

import top.auzqy.design.pattern.behavioral.state.example3.eg3_1.State;

/**
 * 所有状态类的接口
 */
public interface IMario {
  State getName();

  /**
   * 以下是定义的事件
   */
  void obtainMushRoom();
  void obtainCape();
  void obtainFireFlower();
  void meetMonster();
}