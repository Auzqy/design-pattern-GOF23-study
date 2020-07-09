package top.auzqy.design.pattern.behavioral.strategy.eg2.v1;

public class SortingTool {
  public static void main(String[] args) {
    Sorter sorter = new Sorter();
    sorter.sortFile(args[0]);
  }
}